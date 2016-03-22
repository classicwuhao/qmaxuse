package org.tzi.use.uran.location;
import org.tzi.use.uml.mm.*;
import java.util.*;
import uran.solver.*;
import uran.formula.*;
import uran.formula.value.*;
import uran.formula.type.*;
import uran.formula.smt2.*;
import uran.formula.type.*;

public final class ClassLocation extends Location{
	private MClass cls;
	
	public ClassLocation(FunctionFactory factory, MClass cls, Constant aux, Constant weight){
		this.factory = factory;
		this.cls = cls;
		this.aux = aux;
		this.weight = weight;
	}

	@Override
	public String name(){return cls.name();}

	@Override
	public boolean isEnabled(){
		return !isSelected();
	}

	@Override
	public String source(){
		return isSelected() ? "class: "+cls.name()+" is OFF" : 
			"class: " + cls.name()+" is ON "+"(weight:"+ getWeight() +")" ;
	}
	
	@Override
	public String toString(){
		return isSelected() ? cls.name()+" can be removed."	: cls.name()+" is enabled.";
	}

	@Override	
	public boolean isClassLocation(){return true;}

}

