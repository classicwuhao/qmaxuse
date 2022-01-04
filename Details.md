
## Build Your Own QMaxUSE
If you would like to build your own version of QMaxUSE, please see the instructions provided in the following Sections. 

## 1. MSVC Libraries
If you are using Windows, you may need to install [Microsoft Visual C++ Redistributable packages](https://docs.microsoft.com/en-us/cpp/windows/latest-supported-vc-redist?view=msvc-160) on your windows machines. 

### 1.1 Enabling ANSI Colors for Windows (older version: 1511 to 1903)
You need to enable ANSI color mode for Windows 10 to avoid seeing color codes in QMaxUSE 
* Set the following key to be 1.
	```
	[HKEY_CURRENT_USER\Console]
	VirtualTerminalLevel=dword:00000001
	```
	This will enable ANSI colors in Windows terminal. Here is a [link](https://ss64.com/nt/syntax-ansi.html) about the details. 

## 2. Build QMaxUSE
Currently, you can build QMaxUSE on operating systems: Windows 10 (x64), Ubuntu 20.04 (x64) and mac OS Big Sur(x64). In order to build QMaxUSE, you must have [Ant](https://ant.apache.org/) installed on your local machine. QMaxUSE uses an [Z3 SMT Solver](https://github.com/Z3Prover/z3) as its solving engine. The following sections introduce instructions for building QMaxUSE with Z3 SMT solver.

### 2.1 Using pre-built Z3 libraries.
We provide a set of pre-built Z3 libraries under [solver](./solver) directory for Windows (Win10 x64), Linux (Ubuntu 20.04 x64) and Mac OS (Big Sur x64). Everytime when you run QMaxUSE, it will perform a trial run before solving any set of OCL invariants. **You could easily update pre-built Z3 libraries with the latest build on your own machine by just simply overwritting library files under solver directory**.

### 2.2 Building Z3 on your own machine.
You can build Z3 on your own machine based on the instructions provided [here](https://github.com/Z3Prover/z3).
#### 2.2.1 Windows Build
* Install Visual Studio 2017/2019 (community/professional/enterprise)
* Compile Z3 under VS command prompt (please follow Z3 build instructions.). *For x64, you need to compile Z3 with -x.* 
* If Z3 is successfully compiled, it generates 3 files: *com.microsoft.z3.jar*, *libz3.dll* and *libz3java.dll*.
* Set %PATH% to the Z3 build directory (or to the directory that contains these 3 files.).
