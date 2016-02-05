package org.tzi.use.uran.weight;
import java.lang.Exception;

public final class WeightException extends RuntimeException{
	private String message;
	public WeightException(String msg){message = msg;}
}
