package org.tzi.use.uran.location;
import org.tzi.use.uml.mm.*;
import java.util.*;
import uran.solver.*;
import uran.formula.*;
import uran.formula.value.*;
import uran.formula.type.*;
import uran.formula.smt2.*;
import uran.formula.type.*;

public final class InvariantLocation extends Location{
	private MClassInvariant invar;
	
	public InvariantLocation(FunctionFactory factory, MClassInvariant invar, Constant aux, Constant weight){
		this.factory = factory;
		this.invar = invar;
		this.aux = aux;
		this.weight = weight;
	}

	@Override
	public String name(){return invar.name();}

	@Override
	public boolean isEnabled(){
		return !isSelected();
	}

	@Override
	public String source(){
		return isSelected() ? "inv: "+invar.name()+" is OFF" : 
			"inv: " + invar.name()+" is ON "+"(weight:"+ getWeight() +")" ;
	}
	
	@Override
	public String toString(){
		return isSelected() ? invar.name()+" can be removed."	: invar.name()+" is enabled.";
	}

	@Override	
	public boolean isInvaraintLocation(){return true;}

}
