package org.tzi.use.query.setup;

import org.tzi.use.query.state.*;
import org.tzi.use.common.*;
import java.util.*;
import org.tzi.use.query.io.*;
import uran.formula.*;
import uran.formula.value.*;
import uran.formula.type.*;
import uran.formula.smt2.*;
import uran.formula.type.*;
import uran.solver.*;
import java.io.File;


public final class Settings{
    private ColorPrint out;
    private String PathDelimiter="";
    private OS os;
    private Solver DefaultSolver;
    private Solver MainSolver=Solver.UNDEF;

    public Settings (){
        setup();
        this.DefaultSolver=Solver.Z3;
    }   

    public Settings(Solver solver){
        setup();
        this.MainSolver=solver;
    }

    private void setup(){
        String strOS =System.getProperty("os.name");
        if (strOS.contains("Mac")){
            this.os=OS.MACOS;
            this.PathDelimiter="/";
        }
        else if (strOS.contains("linux")){
            this.os=OS.LINUX;
            this.PathDelimiter="/";
        }
        else if (strOS.contains("windows")){
            this.os=OS.WINDOWS;
            this.PathDelimiter="\\";
        }
        else { /* unsupported operating system */ 
            this.os=OS.UNKNOWN;
        }
    }

    public String OS(){return this.os.toString();}

    public boolean SetSolver(){
        Solver solver = (this.MainSolver==Solver.UNDEF) ? this.DefaultSolver : this.MainSolver;
        String solverPath="";
        
        solverPath = ".."+this.PathDelimiter+"solver"+this.PathDelimiter+
        this.os.toString()+this.PathDelimiter+solver.toString();
        File smtsolver = new File(solverPath);

        return smtsolver.exists() && !smtsolver.isDirectory();
    }

    public boolean TrialRun(){
        if (!SetSolver()){
            out.println("Error: No SMT solver is found, please check your installation.",Color.RED);
            return false;
        }

        return true;
    }
}   