package uran.formula;

import uran.formula.visitor.AbstractVisitor;

public final class LabeledFormula extends AbstractFormula{
	private AbstractFormula formula;
	private String label;
	
	public LabeledFormula (AbstractFormula formula, String label){
		this.formula = formula;
		this.label = label;
	}

	public String label(){return this.label;}

	@Override
	public void accept (AbstractVisitor visitor){
		visitor.visit(this);
	}
	
	@Override
	public String toString(){
		return "(! " + this.formula.toString() + ":named " + this.label+ ")";
	}
	
	@Override
	public String toSMT2(){
		return "(! " + this.formula.toSMT2() + ":named " + this.label+ ")";
	}
	
}
