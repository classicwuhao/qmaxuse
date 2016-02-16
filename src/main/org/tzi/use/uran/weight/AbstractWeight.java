package org.tzi.use.uran.weight;


public abstract class AbstractWeight{
	protected WeightType type;
	public abstract String toString();
	public abstract boolean isIntWeight();
	public abstract boolean equalsTo(AbstractWeight a);
	public abstract int compareTo(AbstractWeight a);
}
