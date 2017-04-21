# MaxUSE README

## 1. OVERVIEW
MaxUSE is a tool that finds the set of achievable features and constraint constraints for inconsistent metamodels (UML class diagrams). MaxUSE allows users to freely rank individual model features or use automatic ranking. MaxUSE integrates USE modelling tool with [Z3 SMT Solver](https://github.com/Z3Prover/z3). It currently uses Z3 as its reasoning engine. In addition, MaxUSE also finds all constraint conflicts among the different model features by solving the [set cover problem](https://en.wikipedia.org/wiki/Set_cover_problem).

## 2. BUILD (UBUNTU 15.10/16.04)
* To use the latest version of [Z3 SMT Solver](https://github.com/Z3Prover/z3) and follow the build instructions for Java section.
* Set up *LD_LIBRARY_PATH* to contain *.so* files.
* Copy *com.microsoft.z3.jar* to lib directory.
* Use *ant* to build MaxUSE.

## 3. USEAGE

### 3.1 Ranking Model Features 
* Use *@Rank=c* annotation to rank individual model features, where *c* must be a non-zero integer. For example,
	```
	context Person
	@Rank = 2 
		inv1: Person.allInstances()->forAll(p|p.age>0 and p.age<18)
	```
	inv1 now is ranked with 2.
	
* Use *@Rank=automatic* for automatic ranking. The actual rank is decided by the size of an abstract syntax tree. For example,
	```
	context Person
	@Rank = automatic
		inv1: Person.allInstances()->forAll(p|p.age>0 and p.age<18)
	```
	inv1 now is ranked using automatic ranking.	
	
* Use *@IDEN={Rank=c}* to rank over a set of feature by using a single ranking scheme. *IDEN* is an identifier for a rank scheme. For example, 
	```
	@ClassRank{Rank = 5}
	context Class2
		inv: self.Class2IntAttr3 = 3
		inv: self.Class2IntAttr2 < 19
		inv: Class2.allInstances()->forAll( c2_1,c2_2 | c2_1.Class2IntAttr3 = c2_2.Class2IntAttr2 ) 
	```	
	All 3 class invariants are now ranked with *5* under ranking a scheme named ClassRank.
	
* More examples about using *@Rank* annotation can be found [here](maxuse_examples/).

### 3.2 Finding Achievable Features
* Load annotated your specification into USE, at the USE command prompt type *maxuse*.
	maixmise the number of achievable features based on their rankings.
* Relevant information will be printed on screen or a report will be generated (Currently, it generates a primitive html-basd report and more templates are coming up.). An example can be found [here](http://htmlpreview.github.io/?https://github.com/classicwuhao/maxuse/blob/master/lib/html/UNIVERSITY.html).  More examples can be found [here](lib/html/).

### 3.2 Find Constraint Conflicts
   * Rank equally for each metamodel feature (class, association, invariant).
   * Run maxuse again (type *maxuse* at USE command prompt).
   * MaxUSE will find constraint conflicts among the features.
   * Relevant information will be printed on screen or a report will be generated (Currently, it generates a primitive html-basd report and more templates are coming up.).
   
## 4. SMT2 FORMULAS
* All generated formulas for the benchmark can be viewed [here](maxuse_examples/benchmark/smt2).
* [msc.smt2](maxuse_examples/benchmark/smt2/msc.smt2) contains the set of formulas capturing the [set cover problem](https://en.wikipedia.org/wiki/Set_cover_problem).
* Note that [msc.smt2](maxuse_examples/benchmark/smt2/msc.smt2) will be changed everytime a new model is solved by MaxUSE.

## 5. SOURCE CODE
* The core part of the source code can be found [here](src/main/org/tzi/use/uran).
* MaxUSE uses an SMT solving engine called [uran](https://github.com/classicwuhao/uran) to construct/generate SMT2 formulas and incremently and efficiently solve them.

## 6. DEVELOPMENT IN PROGRESS
* Automatic compiling scripts with Z3 is under development.
* Templates for generating HTML-based report is being added.
* MaxUSE supports OCL constructs used in the benchmark, not all OCL constructs are supported, and we are currently adding more. 
* Multiple SMT solvers (CVC4, MATHSAT5, etc) will be considered and added to interact with MaxUSE.

Last updated: 21-APRIL-2017
