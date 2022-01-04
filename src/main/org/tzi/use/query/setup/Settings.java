package org.tzi.use.query.setup;

import org.tzi.use.query.state.*;
import org.tzi.use.common.*;
import java.io.*;
import java.util.*;
import org.tzi.use.query.io.*;
import uran.formula.*;
import uran.formula.value.*;
import uran.formula.type.*;
import uran.formula.smt2.*;
import uran.formula.type.*;
import uran.solver.*;

public final class Settings{
    private ColorPrint out = new ColorPrint();
    private String PathDelimiter="";
    private OS os;
    private Solver DefaultSolver=Solver.UNDEF;
    private Solver MainSolver=Solver.UNDEF;
    private String solverpath="";
    public Settings (){
        setup();
        this.DefaultSolver=this.MainSolver=Solver.Z3;
        this.solverpath=SetSolver();
    }

    public Settings(Solver solver){
        setup();
        this.DefaultSolver=this.MainSolver=solver;
        this.solverpath=SetSolver();
    }

    private void setup(){
        String strOS =System.getProperty("os.name");
        
        if (strOS.contains("Mac")){
            this.os=OS.MACOS;
            this.PathDelimiter="/";
        }
        else if (strOS.contains("Linux")){
            this.os=OS.LINUX;
            this.PathDelimiter="/";
            
        }
        else if (strOS.contains("Windows")){
            this.os=OS.WINDOWS;
            this.PathDelimiter="\\";
        }
        else { /* unsupported operating system */ 
            this.os=OS.UNKNOWN;
        }
    }

    public String OS(){return this.os.toString();}
    public OS System(){return this.os;}

    public boolean SetSolver(Solver solver){
        this.MainSolver=solver;
        this.solverpath=SetSolver();
        return ShowSolverVersion();
    }

    private String SetSolver(){
        Solver solver = (this.MainSolver==Solver.UNDEF) ? this.DefaultSolver : this.MainSolver;
        String solverPath="";
        
        solverPath = ".."+this.PathDelimiter+"solver"+this.PathDelimiter+
        this.os.toString()+this.PathDelimiter+solver.toString();
        
        if (this.os==OS.WINDOWS){
            this.solverpath=solverPath+".exe";
        }
        else{
            this.solverpath=solverPath;
        }

        File smtsolver = new File(this.solverpath);
        //System.out.println("path:"+this.solverpath);
        return (smtsolver.exists() && !smtsolver.isDirectory()) ? solverPath : "";
    }

    /**
     * show solver's version.
     */
    public boolean ShowSolverVersion(){
        Process process;
        String cmd="";
        if (this.solverpath.length()==0) {
            System.out.println("Cannot find solver.");
            return false;
        }

        if (this.MainSolver==Solver.Z3)
            cmd=this.solverpath+" --version ";
        else if (this.MainSolver==Solver.CVC5)
            cmd=this.solverpath+" --version ";
        else
            return false;
        
        try{
            
            process = Runtime.getRuntime().exec(cmd);

            OutputStream in = process.getOutputStream();
		    InputStream err = process.getErrorStream();
		    InputStream out = process.getInputStream();

            BufferedReader output = new BufferedReader (new InputStreamReader(out));
            String line=output.readLine();
            System.out.println(line);
        }
        catch(Exception e){
            System.out.println("unable to retrieve version information.");
            return false;
        }

        return true;
    }

    public String SolverPath(){
        return this.solverpath;
    }

    public Solver solver(){
        return this.MainSolver;
    }

    public boolean TrialRun(){
        if (SetSolver().equals("")){
            out.println("Error: No SMT solver is found, please check your installation.",Color.RED);
            return false;
        }
        else{
            out.println(this.MainSolver.toString()+" solver is picked.",Color.GREEN);
        }
        return true;
    }
}   