# QMaxUSE

## 0. Latest Release
check out [here](https://github.com/classicwuhao/qmaxuse/releases/tag/v1.0.1) for the latest changes and features of QMaxUSE.

## 1. Overview
**QMaxUSE** is an automated verification tool that is able to verify consistencies of a UML class diagram annotated with OCL invariants. QMaxUSE has two distinct features: (1) A query langauge that allows users to select parts of class diagram to be verified. (2) A powerful algorithm that is capable of performing concurrent verification on large number of complex OCL invariants. This is achieved by decomposing a large model into multiple queries.

## 2. Download and Run
Once you have JDK installed, you can just **download QMaxUSE and run it without installing any additional libraries**. QMaxUSE is a command-line based tool and currently supports Windows 10(x64), Ubuntu 20.04(x64) and macOS Big Sur(x64). If you would like to build your own version of QMaxUSE, please see [here](Details.md) for details.

## 3. Running QMaxUSE on Windows 10 (x86/x64), Ubuntu 20.04(x64), macOS Big Sur (x64)
* Make sure you have JDK installed. 
* Download QMaxUSE from [here](https://github.com/classicwuhao/qmaxuse/releases/tag/Latest), and go to the lib directory type:
	```
	java -jar qmaxuse.jar
	```
	to lanuch QMaxUSE.

### 3.1 Solver Support
Currently, [the latest version of QMaxUSE](https://github.com/classicwuhao/qmaxuse/releases/tag/v1.0.1) supports two solvers: [z3](https://github.com/Z3Prover/z3) and [cvc5](https://github.com/cvc5/cvc5) (for ubuntu and macOS). To switch between z3 and cvc5 for verification tasks, one can use the following command at QMaxUSE prompt:

```
	set-solver:<solver name>
```
Here, \<solver name\> can be either z3 or cvc5. If switch is successful, QMaxUSE will display a corresponding sovler's version information.

### 3.2 MaxUSE Support
QMaxUSE is fully compatible with MaxUSE. Everything is supported by MaxUSE is available in QMaxUSE including finding as many satisfiable features as possible and pinpointing all OCL conflicting constraints. However, you may need to setup Z3 for MaxUSE. See the instructions [here](https://github.com/classicwuhao/maxuse/blob/master/MaxUSE_README.md). Technical details about how MaxUSE works are described [here](https://link.springer.com/article/10.1007/s10270-020-00849-8).

## 4. USEAGE

### 4.1 Issuing a query
Our query langauge allows users to issue a query to select parts of a class diagram to be verified. QMaxUSE accepts queries from command line. Here are some query examples:

* **Example 1: selecting classes, attributes and associations.**
	```sql
	$select Person, Student.year, Student:study:Module.
	```
	Classes *Person*, *Student* and *Module* are selected. An attribute *year (Student)* is selected. An association *study* is selected. Note class *Module* is implicitly selected here because of *study* association.

* **Example 2: using a wild character**
	```sql
	$select Student.*, Student:*:Module
	```
	All attributes of *Student* class and any associations with association-ends *Student* and *Module* are selected.
	
* **Example 3: selecting OCL invariants.**
	```sql
	$select Person, Student with Student::*
	```	
	Classes *Person*, *Student* and all ocl invariants defined under *Student* class are selected. Further, all relevant clases, attributes and associations used in an ocl expression are also selected.
	
* **Example 4: exclusion**
	```sql
	$select Student.* with Student::* but Student::inv4
	```
	All ocl invariants defined under *Student* class are selected except for *inv4*. Further, all relevant clases, attributes and associations used in an ocl expression are also selected.

* **Example 5: aliasing and joint queries**
	```sql
	$select Department, Asssignment, Student:finish:Assignment as query1
	$select Student, Module with Student::* as query2
	$query1 & query2
	```
	The first query has an alias **query1**. The second query has an alias **query2**. The last query is a **joint query**: query1 intersects query2. The intersection of two sets of feature are selected.

* **Example 6: saving your queries for later usage**
	```sql
	module QuerySet
		select Person.*, Student.*, Module.*, Assignment:*:* with Student::*, Module::* but Person as class_query
	end
	```
	The above query is saved in a query module called *QuerySet*. This query module is a part of (*university*) specification and it is automatically loaded when QMaxUSE reads this specification. A user can type
	```sql
	$QuerySet.class_query
	```
	to issue *class_query*. A query module can contain multiple aliased queries. Note that to reuse a query at a later stage, you must give a query an alias.

* **Example 7: query with OCL injection (coming soon)** 
	```sql
	select Person.*, Student.* with Student::* inject {Student.allInstances()->forAll(s|s.modules->notEmpty())}
	```
	The above query is injected with an OCL invariant. The verification procedure will verify the query along with injected OCL. The verification will tell the consequences if the injected OCL invariant could break the consistencies or not. This is particularly useful for those who are not sure about adding an OCL invariant to a class whether will break the consistencies.

### 4.2 Concurrent verification
QMaxUSE uses a specialised algorithm to decompose OCL invariants into multiple queries that can be verified concurrently. To use this feaure in QMaxUSE,
* Load your specification into QMaxUSE, at the command prompt type *qverify*.
* The verification results are shown in the command prompt.
* A screenshot can be found [here](./query_examples/screenshot.png)

## 5. SMT2 ASSERTIONS
QMaxUSE's verification procedures use Z3 SMT solver as its solving engine. To interact with Z3, it uses [uran](https://github.com/classicwuhao/uran) as its intermediate interfaces. Uran is responsible for generating well-formed SMT2 assertions and interpretation.

## 6. Benchmark
Overall, QMaxUSE improves up to 30x efficiency in verification. In particular, QMaxUSE performs very well on models with extreme size of OCL invariants. Try out some models from our [benchmark](./query_examples/benchmark).

## 7. Remarks
* The implementation of QMaxUSE spans over the past 2 years. 
* We are extending our query langauge to include OCL and SMT assertion injection. 
* We are working on integrating a string solver into QMaxUSE.
* QMaxUSE will be included as a solution to one of our industrial partners.
* QMaxUSE supports OCL constructs used in the benchmark, and not all OCL constructs are supported (we are currently adding more). 

## 8. Papers:
 * QMaxUSE: A Query-based Verification Tool for UML Class Diagrams with OCL Invariants (FASE)
 * A Formal Approach to Finding Inconsistencies in a Metamodel (Software and Systems Modeling)
 * MaxUSE: A Tool for Finding Achievable Constraints and Conflicts for Inconsistent UML Class Diagrams (iFM)
 * Finding Achievable Features and Constraint Conflicts for Inconsistent Metamodels (ECMFA).
## 9. Acknowledgement
We woud like to thank our industrial partner LingCui Yu, HuangXin Xin and their teams from SYSUCC for helpful comments on this research. 

Last updated: 04-Jan-2022
