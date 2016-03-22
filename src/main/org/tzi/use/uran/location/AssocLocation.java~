package org.tzi.use.uran.location;
import org.tzi.use.uml.mm.*;
import java.util.*;
import uran.solver.*;
import uran.formula.*;
import uran.formula.value.*;
import uran.formula.type.*;
import uran.formula.smt2.*;
import uran.formula.type.*;

public final class AssocLocation extends Location{
	private MAssociation assoc;
	
	public AssocLocation(FunctionFactory factory, MAssociation assoc, Constant aux, Constant weight){
		this.factory = factory;
		this.assoc = assoc;
		this.aux = aux;
		this.weight = weight;
	}

	@Override
	public String name(){return assoc.name();}

	@Override
	public boolean isEnabled(){
		return !isSelected();
	}

	@Override
	public String source(){
		return isSelected() ? "inv: "+assoc.name()+" is OFF" : 
			"inv: " + assoc.name()+" is ON "+"(weight:"+ getWeight() +")" ;
	}
	
	@Override
	public String toString(){
		return isSelected() ? assoc.name()+" can be removed."	: assoc.name()+" is enabled.";
	}

	@Override	
	public boolean isAssocLocation(){return true;}

}
