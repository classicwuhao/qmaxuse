package org.tzi.use.uran.weight;


public class IntWeight extends AbstractWeight{
	int weight;		
	
	public IntWeight(int weight, WeightType type){
		checkWeight(weight);
		this.weight = weight;
		this.type = type;
	}

	public int  getWeight(){return weight;}
	public void setWeight(int weight){
		checkWeight(weight);
		this.weight=weight;
	}

	private void checkWeight(int weight){
		if (weight<0) throw new WeightException("Error: a weight cannot be negative.");
	}

	@Override
	public boolean isIntWeight(){return true;}

	@Override
	public String toString(){
		return "<"+this.weight+">";
	}
}
