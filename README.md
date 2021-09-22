
# News: MaxUSE is upgraded !!!
# QMaxUSE

## 1. Overview
**QMaxUSE** is a verification tool that is able to verify a UML class diagram annotated with OCL invariants. QMaxUSE improves MaxUSE's techniques by providing two distinct features: (1) A query langauge that allows users to select parts of class diagram to be verified. (2) A new verification algorithm that is capable of handling extreme size of OCL invariants. 

## 2. Build Instructions
Currently, QMaxUSE supports three major operating systems: Windows 10 (x64), Ubuntu 20.04 (x64) and mac OS Big Sur(x64). QMaxUSE uses an [Z3 SMT Solver](https://github.com/Z3Prover/z3) as its solving engine. The following sections introduce instructions for building QMaxUSE with Z3 SMT solver.

### 2.2 Using pre-built Z3 libraries.
We do provide a set of pre-built Z3 libraries under [solver](./solver) directory for Windows (Win10 x64), Linux (Ubuntu 20.04 x64) and Mac OS (Big Sur x64). Everytime QMaxUSE will perform a trial run before solving a set of OCL invariants. **You could easily update pre-built Z3 libraries with the latest build on your own machine by just simply overwritting library files under solver directory**.

### 2.3 Building Z3 on your own machine.
You can build Z3 on your own machine based on the instructions provided [here](https://github.com/Z3Prover/z3).
#### 2.3.1 Windows Build
* Install Visual Studio 2017/2019 (community/professional/enterprise)
* Compile Z3 under VS command prompt (please follow Z3 build instructions.). *For x64, you need to compile Z3 with -x.* 
* If Z3 is successfully compiled, it generates 3 files: *com.microsoft.z3.jar*, *libz3.dll* and *libz3java.dll*.
* Set %PATH% to the Z3 build directory (or to the directory that contains these 3 files.).

### 2.4 Windows 10 (x86/x64), Ubuntu 20.04(x64), macOS Big Sur (x64)
* Make sure you have JDK installed. 
* Either you use our provided pre-built libraries (You don't have to do anything) or use the intructions provided above for building Z3 libraries on your own machine.
* Download QMaxUSE and in the lib directory type:
	```
	java -jar qmaxuse.jar
	```  
	to lanuch QMaxUSE.
* Load a sample model.

### 2.3 MaxUSE Support
QMaxUSE is fully compatible with MaxUSE. Everything is supported by MaxUSE is runnable in QMaxUSE including finding as many satisfiable features as possible and pinpointing all OCL conflicting constraints. Details about MaxUSE are described [here](https://link.springer.com/article/10.1007/s10270-020-00849-8).


## 3. USEAGE

### 3.1 Issuing a query
Our query langauge allows users to issue a query to select parts of a class diagram. QMaxUSE accepts queries from command line. Here are some query examples:

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
	$select Student::* but Student::inv4
	```
	All ocl invariants defined under *Student* class are selected except for *inv4*. Further, all relevant clases, attributs and associations used in an ocl expression are also selected.

* **Example 5: aliasing and joint queries**
	```sql
	$select Department, Asssignment, Student:finish:Assignment as query1
	$select Student, Module with Student::* as query2
	$query1 & query2
	```
	The first query has an alias **query1**. The second query has an alias **query2**. The last query is a **joint query**: query1 intersects query2. The intersection of two sets of feature are selected.

* **Example 6: saving queries**
	```sql
	module query_set
		select Person.*, Student.*, Module.*, Assignment:*:* with Student::*, Module::* but Person as q0
	end
	```
	The above query is saved in a query module called *query_set*. This query module is a part of (*university*) specification and it is automatically loaded when QMaxUSE reads this specification. A user can type
	```sql
	$query_set.q0
	```
	to issue *q0*. A query module can contain multiple aliased queries.

### 3.2 Concurrent verification
QMaxUSE can decompose OCL invariants into multiple queries that can be verified concurrently. To use this feaure in QMaxUSE,
* Load your specification into QMaxUSE, at the command prompt type *qverify*.
* The verification results are shown in the command prompt.
* A screenshot can be found [here](./query_examples/screenshot.png)
   		   
## 4. SMT2 ASSERTIONS
QMaxUSE's verification procedures use Z3 SMT solver as its solving engine. To interact with Z3, it uses [uran](https://github.com/classicwuhao/uran) as its intermediate interfaces. Uran is responsible for generating well-formed SMT2 assertions and interpretation.

## 5. Benchmark
Compare to MaxUSE, QMaxUSE improves up to 30x efficenicy in verification. In particular, QMaxUSE performs very well on models with extreme size of OCL invariants. Try out some models from our [benchmark](./query_examples/benchmark).

## 6. Remarks
* The implementation of QMaxUSE spans over the past 2 years. 
* We are extending our query langauge to include OCL and SMT assertion injection. 
* We are working on integrating a string solver into QMaxUSE.
* QMaxUSE will be included as a solution to one of our industrial partners.
* QMaxUSE supports OCL constructs used in the benchmark, and not all OCL constructs are supported (we are currently adding more). 
* Multiple SMT solvers (CVC4, MATHSAT5, etc) are being added.

## 7. Acknowledgement
We woud like to thank our industrial partner LingCui Yu, HuangXin Xin and their teams from SYSUCC for helpful comments on this research. 

Last updated: 21-July-2021
