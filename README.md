# QMaxUSE

## 1. OVERVIEW
QMaxUSE is a verification tool that is able to verify a UML class diagram annotated with OCL invariants. QMaxUSE enhances MaxUSE's techniques by providing two additional distinct features: (1) A simple query langauge that allows users to select parts of class diagram to be verified. (2) A new verification algorithm that is capable of handling extreme size of OCL invariants. 
finds the set of achievable features and constraint conflicts for inconsistent metamodels (UML class diagrams). MaxUSE allows users to freely or automatically rank individual model features. MaxUSE integrates USE modelling tool with [Z3 SMT Solver](https://github.com/Z3Prover/z3). It currently uses [uran](https://github.com/classicwuhao/uran) as its solving engine to interact with underlying SMT solver.

## 2. BUILD INSTRUCTIONS
QMaxUSE uses an [Z3 SMT Solver](https://github.com/Z3Prover/z3) as it's verification engine. The following sections give instructions for building QMaxUSE.

### 2.1 WINDOWS 10 (x86/x64)
* Make sure you have JDK installed. 
* Download Z3 SMT solver (latest version).
* Install Visual Studio 2017/2019 (community/professional/enterprise)
* Compile Z3 under VS command prompt (please follow Z3 build instructions.). *For x64, you need to compile Z3 with -x.* 
* If Z3 is successfully compiled, it generates 3 files: *com.microsoft.z3.jar*, *libz3.dll* and *libz3java.dll*.
* Set %PATH% to the Z3 build directory (or to the directory that contains these 3 files.).
* Download QMaxUSE and in the lib directory type:
	```
	java -jar qmaxuse.jar
	```  
	to lanuch QMaxUSE.
* Load a sample model.
* In the USE command line, type *maxuse -q* to check the sample model.

### 2.2 Pre-built Libraries
A user can choose to use pre-built libraries. The pre-built libraries are located [here](solver). Currently, the pre-built libraries are tested under Windows 10 and MacOS. For linux, please follow the instructions [here](https://github.com/Z3Prover/z3).

### 2.3 MaxUSE Support
QMaxUSE is fully compatible with MaxUSE. Everything is supported by MaxUSE is runnable in QMaxUSE including finding as many satisfiable features as it can and pinpointing all possible OCL conflicting constraints. Details about MaxUSE are described [here](https://link.springer.com/article/10.1007/s10270-020-00849-8).


## 3. USEAGE

### 3.1 Issuing a query
Our query allows users to issue a query to select parts of a class diagram. To issue a query, you must do it in QMaxUSE command line. Here are some query examples:

* Example 1: selecting classes, attributes and associations.
	```
	$select Person, Student.year, Student:study:Module.
	```
	Classes: *Person*, *Student*, *Module*. Attribute *year (Student)* is selected. Association *choose* is selected. Note class *Module* is implicitly selected here because of *choose* association.

* Example 2: using a wild character *
	```
	$select Student.*, Student:*:Module
	```
	All attributes of *Student* and any associations with association-ends *Student* and *Module* are selected.
	
* Example 3: selecting OCL invariants.
	```
	$select Person, Student with Student::*
	```	
	Classes *Person*, *Student* and all ocl invariants defined under *Student* class are selected. Further, all relevant clases, attributs and associations used in an ocl expression are also selected.
	
* Example 4: exclusion
	```
	$select Student::* but Student::inv4
	```
	All ocl invariants defined under *Student* class are selected except for *inv4*. Further, all relevant clases, attributs and associations used in an ocl expression are also selected.

* Example 5: aliasing and joint queries
	```
	$select Department, Asssignment, Student:finish:Assignment as query1
	$select Student, Module with Student::* as query2
	$query1 & query2
	```
	The first query has an alias **query1**. The second query has an alias **query2**. The last query is a **joint query** query1 intersects query2. The intersection of two sets are selected.

* Example 6: saving queries
	```
	module query_set
		select Person.*, Student.*, Module.*, Assignment:*:* with Student::*, Module::* but Person as q0
	end
	```
	The above query is saved in a query module called *query_set*. This query module is a part of (*university*) specification and it is automatically loaded when QMaxUSE reads this specification. A user can type
	```
	$query_set.q0
	```
	to issue *q0*. A query module can contain multiple aliased queries.

### 3.2 Concurrent verification
QMaxUSE can decompose OCL invariants into multiple queries that can be verified concurrently. To use this feaure in QMaxUSE,
* Load your specification into QMaxUSE, at the command prompt type *qverify*.
* The verification results are shown in the command prompt.
* A screenshot is displayed [here](./query_examples/screenshot.png)
   		   
## 4. SMT2 ASSERTIONS
QMaxUSE integrates MaxUSE with Z3 SMT solver. However, it uses [uran](https://github.com/classicwuhao/uran) as its intermediate interfaces for interacting with Z3. Uran is responsible for generating well-formed SMT2 assertions.

## 5. Benchmark
QMaxUSE uses the same benchmark as MaxUSE uses. The full details about this benchmark can be viewed [here](./query_examples/benchmark)

## 6. REMARKS
* The implementation of QMaxUSE spans over the past 1 year. 
* We are extending our query langauge to include OCL and SMT assertion injection. 
* We are working on integrating a string solver into QMaxUSE.
* QMaxUSE will be included as a solution to one of our industrial partners.
* QMaxUSE supports OCL constructs used in the benchmark, and not all OCL constructs are supported (we are currently adding more). 
* Multiple SMT solvers (CVC4, MATHSAT5, etc) are being added.

## 7. ACKNOWLEDGEMENTS
We woud like to thank [Joesph Timoney](https://github.com/ArpSolina) for helpful comments on this research. 

Last updated: 27-April-2021
