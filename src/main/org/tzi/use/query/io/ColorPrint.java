package org.tzi.use.query.io;

import java.io.PrintWriter;
import java.io.OutputStream;

public class ColorPrint extends PrintWriter{
	private static final String prefix="\u001B[";
	public ColorPrint(OutputStream out){super(out);}

	public void print(String message, String color){
		this.print(prefix+color+message+" "+prefix+Color.DEFAULT);
	}

	public void println(String message, String color){
		this.println(prefix+color+message+" "+prefix+Color.DEFAULT);
	}
	
}
