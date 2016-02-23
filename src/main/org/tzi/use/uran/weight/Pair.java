package org.tzi.use.uran.weight;


public class Pair<U,V>{
	private U u;
	private V v;

	
	public Pair (U u, V v){
		this.u = u;
		this.v = v;
	}

	public U first(){return this.u;}
	public V second(){return this.v;}
	
	public String toString(){
		return "("+this.u+" , "+this.v+")";
	}
}
