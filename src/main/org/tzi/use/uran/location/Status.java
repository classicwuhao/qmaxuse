package org.tzi.use.uran.location;

public final class Status {
	private boolean enabled;
	private String name;
	private int weight;
	private int type;

	public static final int CLASS=0;	
	public static final int ASSOC=1;
	public static final int INVAR=2;
	public static final int UNKNOWN=2;

	public Status(boolean b, String n, int w, int t){
		this.enabled = b;
		this.name = n;
		this.weight = w;
		this.type = t;
	}

	public void setEnabled(boolean b){ this.enabled = b;}
	public void setName(String name){this.name=name;}
	public void setWeight(int weight){this.weight = weight;}
	public String name(){return this.name;}
	public boolean enabled(){return this.enabled;}
	public int weight(){return this.weight;}
	public int getType(){return this.type;}

	public String toString(){
		return this.name+","+this.enabled+","+this.weight;
	}
	
}
