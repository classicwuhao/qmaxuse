<<<<<<< HEAD
# MaxUSE
[![License: GPL v3](https://img.shields.io/badge/License-GPL%20v3-blue.svg)](http://www.gnu.org/licenses/gpl-3.0)

## 1. OVERVIEW
MaxUSE is a tool that finds the set of achievable features and constraint conflicts for inconsistent metamodels (UML class diagrams). MaxUSE allows users to freely or automatically rank individual model features. MaxUSE integrates USE modelling tool with [Z3 SMT Solver](https://github.com/Z3Prover/z3). It currently uses [uran](https://github.com/classicwuhao/uran) as its solving engine to interact with underlying SMT solver. **The full technical details including: theories, proofs and algorithms are described in this paper [(online)](https://link.springer.com/article/10.1007/s10270-020-00849-8) that is currently accepted and published by [SoSym](https://www.springer.com/journal/10270).**
=======
# QMaxUSE

## 1. OVERVIEW
QMaxUSE is a verification tool that is able to verify a UML class diagram annotated with OCL invariants. QMaxUSE enhances MaxUSE's techniques by providing two additional distinct features: (1) A simple query langauge that allows users to select parts of class diagram to be verified. (2) A new verification algorithm that is capable of handling extreme size of OCL invariants. 
finds the set of achievable features and constraint conflicts for inconsistent metamodels (UML class diagrams). MaxUSE allows users to freely or automatically rank individual model features. MaxUSE integrates USE modelling tool with [Z3 SMT Solver](https://github.com/Z3Prover/z3). It currently uses [uran](https://github.com/classicwuhao/uran) as its solving engine to interact with underlying SMT solver.
>>>>>>> QMaxuse

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
	
<<<<<<< HEAD
* More examples about using *@Rank* annotation can be found [here](maxuse_examples/).

### 3.2 Finding All Achievable Features
* Load your specification into MaxUSE, at the command prompt type *maxuse*.
	1. If your model is *partially* or *fully* ranked, MaxUSE will find set of achievable model features based on their rankings.
	2. If your model is *not* ranked at all, MaxUSE will verify the consistency of your model.
* The results will be printed on screen or a report will be generated. An example can be found [here](http://htmlpreview.github.io/?https://github.com/classicwuhao/maxuse/blob/master/lib/html/UNIVERSITY.html). More examples can be found [here](lib/html/).

### 3.3 Finding All Constraint Conflicts
* Rank *equally* for each model feature (class, association, invariant). We recommend users normalise the rankings using relativly smaller integers.
* Run *maxuse*.
* MaxUSE will find:
   1. *all* constraint conflicts among the features.
   2. *all* possible ways of achieving a *maximum* number of features. 
* Check out the [result](http://htmlpreview.github.io/?https://github.com/classicwuhao/maxuse/blob/master/lib/html/DisjointSubclasses.html) for this [example](https://github.com/classicwuhao/maxuse/blob/master/maxuse_examples/benchmark/GroupA/DisjointSubclasses_weight_equal.use).

## 4. THEORIES & TECHNIAL DETAILS
* **The full technical details including: theories, proofs and algorithms are described in this paper [(preprint)](https://classicwuhao.github.io/pdf/sosym.pdf) that is currently accepted and published by [SoSym](https://www.springer.com/journal/10270).**
* If you are interested in theories and algorithms we used in MaxUSE, see our research paper (ECMFA@[STAF2017](http://www.informatik.uni-marburg.de/staf2017/)): **Finding Achievable Features and Constraint Conflicts for Inconsistent Metamodels.**
* If you are interested in how MaxUSE inergrates with the Z3 SMT solver, see our tool paper ([iFM 2017](http://ifm2017.di.unito.it/)): **MaxUSE A Tool for Finding Achievable Constraints and Conflicts for Inconsistent UML Class Diagrams.**
* If you are a geek and love coding, see Section 6.
=======
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
>>>>>>> QMaxuse
   		   
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

<<<<<<< HEAD
Last updated: 16-December-2020
=======
Last updated: 27-April-2021
>>>>>>> QMaxuse
