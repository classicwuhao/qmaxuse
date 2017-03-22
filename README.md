# MaxUSE README

## 1. OVERVIEW
MaxUSE is a tool that satisfies the number of invariants (constraints) as many as possible when a model (metamodel) is not consistent. MaxUSE allows users to rank individual model features based on their own domain specific knowledge or using automatic ranking.  MaxUSE is built on top of USE modelling tool, it currently uses [Z3 SMT Solver](https://github.com/Z3Prover/z3) as its reasoning engine and incremently solves long nested complicated logic formulas to maximise the number of invariants based on their rankings. Moreover, MaxUSE also finds all constraint conflicts among the features by further solving the [set cover problem](https://en.wikipedia.org/wiki/Set_cover_problem).

## 2. BUILD (UBUNTU 15.10/16.04)
* To use Z3, download the latest [Z3 SMT Solver](https://github.com/Z3Prover/z3) and follow build instructions (Java section).
* Set up *LD_LIBRARY_PATH* to contain *.so* files.
* Copy *com.microsoft.z3.jar* to lib directory.
* Use *ant* to build MaxUSE.

## 3. USEAGE

### 3.1 Find All Achievable Features (based on their rankings) 
* Specify *@Rank=c* annotation to rank individual model features. For more details, please see all sample files [here](maxuse_examples/).
* Load annotated model into USE, at the USE command prompt type *maxuse* to maixmise the number of achievable features based on their rankings.
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

Last updated: 22-MARCH-2017
