
package org.tzi.use.uran.visitor;
import java.lang.Exception;

public final class VisitorException extends RuntimeException{
	private String message;
	public VisitorException(String msg){message = msg;}
}
