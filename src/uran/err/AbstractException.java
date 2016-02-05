/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++Written by: Hao Wu++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *
 *	This is a part of my PhD work.
 *  haowu@cs.nuim.ie
 *  APR-2012 
 *  
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ++++++++++++++++++++++++++++++Do or do not, there is no try.+++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package uran.err;
import java.io.*;
import java.lang.Exception;

public abstract class AbstractException extends RuntimeException{
	private String message;
	private PrintWriter err = new PrintWriter(System.err,true);
	protected int code;
	
	//public abstract void printErrMessage(String info);
	public AbstractException(){};
	
	public AbstractException(String msg){};

	public AbstractException(String msg, int code){
		this.message = msg;
		this.code= code;
	}
	
}
