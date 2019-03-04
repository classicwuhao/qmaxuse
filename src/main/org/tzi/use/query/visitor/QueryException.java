package org.tzi.use.query.visitor;

public class QueryException extends Exception {
    private static final long serialVersionUID = 5L;

    public QueryException(String message) {
    	super(message);
    }

    public String getMessage(){
        return "QueryException: "+super.getMessage();
    }
}