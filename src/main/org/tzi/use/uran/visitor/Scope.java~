package org.tzi.use.uran.visitor;

import java.util.HashMap;
import uran.formula.*;

public class Scope{
	private HashMap <String, Variable> contents = new HashMap<String, Variable>();
	public Scope next=null;
	public Scope prev=null;

	public Scope(){}
	public void add (String name, Variable var){
		contents.put(name, var);
	}
	public void removeContent (String name){
		contents.remove(name);
	}
	public Variable lookup (String name){
		return contents.get(name);
	}

	public void add (Scope s){
		if (s==null) return;
		Scope tail = this.tail();
		tail.next = s;
		s.prev=tail;
	}

	public Variable lookupB(String name){
		Scope s = this;
		while (s!=null){
			if (s.lookup(name)!=null) return s.lookup(name);
			s = s.prev;
		}
		return null;
	}

	public Variable lookupF(String name){
		Scope s = this;
		while (s!=null){
			if (s.lookup(name)!=null) return s.lookup(name);
			s = s.next;
		}
		return null;
	}

	public Variable[] allCurrentContents(){
		int i=0;
		Variable[] vars= new Variable[this.size()];		
		for (String str : contents.keySet()) vars[i++] = contents.get(str);
		return vars;
	}

	public Scope tail(){
		Scope s = this;
		while (s.next!=null) s=s.next;

		return s;
	}

	public Scope head(){
		Scope s = this;
		while (s.prev!=null) s=s.prev;

		return s;
	}

	/* shrink until only head is left. */
	public void shrink(){
		Scope s = this;
		while (s.next!=null) s=s.next;
		if (s!=s.head()) s.prev.next=null;
	}

	public int size(){return contents.size();}
	public boolean hasNext(){ return this.next != null;}
	public boolean hasPrev(){ return this.prev != null;}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		Scope s = this;
		
		if (s==null) return sb.append("contents: empty").toString();
		sb.append(" { \n ");
		while (s.prev!=null) {
			sb.append (" { \n ");
			Variable[] vars = s.allCurrentContents();
			for (int i=0;i<vars.length;i++)	sb.append(vars[i].toString()+" , ");
			s = s.prev;
			sb.append (" \n }\n");
		}
		
		
		Variable[] first = s.allCurrentContents();
		for (int i=0;i<first.length;i++) sb.append(first[i].toString()+" , ");

		sb.append (" \n }\n");
		return sb.toString();
	}

	

}
