package org.tzi.use.uran.weight;


public class IntWeight extends AbstractWeight{
	int weight;		
	public final static int DEFAULT=-1;
	
	public IntWeight(){}
	public IntWeight(int weight){
		checkWeight(weight);
		this.weight = weight;
	}

	public IntWeight(int weight, WeightType type){
		checkWeight(weight);
		this.weight = weight;
		this.type = type;
	}

	public int getWeight(){return weight;}
	public void setWeight(int weight){
		checkWeight(weight);
		this.weight=weight;
	}

	private void checkWeight(int weight){
		if (weight<-1) throw new WeightException("Error: a weight cannot be negative.");
	}

	@Override
	public boolean isIntWeight(){return true;}

	@Override
	public boolean equalsTo(AbstractWeight iw){
		if (iw == null) throw new WeightException("Error: weight cannot be null.");
		if (!iw.isIntWeight()) return false;
		return this.getWeight() == ((IntWeight) iw).getWeight();	
	}	

	@Override
	public int compareTo(AbstractWeight iw){
		if (iw == null) throw new WeightException("Error: weight cannot be null.");
		if (!iw.isIntWeight()) return -2;
		if (this.getWeight() < ((IntWeight) iw).getWeight()) return -1;
		if (this.getWeight() == ((IntWeight) iw).getWeight()) return 0;
		return 1;
	}

	@Override
	public String toString(){
		return "<"+this.weight+">";
	}
}
