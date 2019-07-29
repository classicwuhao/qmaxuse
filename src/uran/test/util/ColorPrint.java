package uran.test.util;

public class ColorPrint{
	private static final String prefix="\u001B[";

	public static void print(String message, String color){
		if (System.getProperty("os.name").startsWith("Windows"))
			System.err.print(message);
		else
			System.err.print(prefix+color+message+" "+prefix+Color.DEFAULT);
	}

	public static void println(String message, String color){
		if (System.getProperty("os.name").startsWith("Windows"))
			System.err.println(message);
		else
			System.err.println(prefix+color+message+" "+prefix+Color.DEFAULT);
	}
	
}
