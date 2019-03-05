package org.tzi.use.query.io;

public class ColorPrint {
	private static final String prefix="\u001B[";
	public ColorPrint(){}

	public void print(String message, String color){
		System.err.print(prefix+color+message+" "+prefix+Color.DEFAULT);
	}

	public void println(String message, String color){
		System.err.println(prefix+color+message+" "+prefix+Color.DEFAULT);
	}
	
}
