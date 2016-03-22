package org.tzi.use.uran.location;
import org.tzi.use.uml.mm.*;
import java.util.*;
import uran.solver.*;
import uran.formula.*;
import uran.formula.value.*;
import uran.formula.type.*;
import uran.formula.smt2.*;
import uran.formula.type.*;

public abstract class Location{
	protected LocationType type;	
	protected FunctionFactory factory;
	protected Constant aux;
	protected Constant weight;
	
	public abstract String source();
	public abstract String toString();
	public boolean isClassLocation(){return false;}	
	public boolean isInvaraintLocation(){return false;}
	public boolean isAssocLocation(){return false;}

	public abstract boolean isEnabled();
	public abstract String name();

	public boolean isSelected(){
		Value value = this.factory.getValue(aux.name());
		if (value==null) return false;

		if (value.IsInt()){
			IntValue iv = (IntValue) value;
			return iv.getValue()==1 ? true : false;
		}

		return false;
	}
	
	public int getWeight(){
		Value value = this.factory.getValue(weight.name());
		if (value==null) return 0;

		if (value.IsInt()){
			IntValue iv=(IntValue) value;
			return iv.getValue();
		}

		return 0;
	}

	protected void setAux(Constant aux){this.aux=aux;}
	protected void setWeight(Constant weight){this.weight=weight;}
	protected Constant getAux(){return this.aux;}
	protected Constant getW(){return this.weight;}
}
