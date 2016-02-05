/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++Written by: Hao Wu++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *
 *	This is a part of my research work.
 *  haowu@cs.nuim.ie
 *  APR-2015 
 *  
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ++++++++++++++++++++++++++++++Do or do not, there is no try.+++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */

package uran.formula;

import uran.err.NullableFormulaException;
import uran.err.MissingFormulaException;


public final class OneFormula extends BinaryFormula{

	public OneFormula(){super(Connective.OR);}
		
	public OneFormula(AbstractFormula f1, AbstractFormula f2){
		super(Connective.OR,
			new AndFormula (new NegFormula(f1), f2),
			new AndFormula (f1,new NegFormula(f2))
		);
	}

	@Override
	public BinaryFormula merge(AbstractFormula...formulas){
		if (formulas==null) throw new NullableFormulaException("Build One Formula: No formula(s) found.");
		if (formulas.length<=1) throw new MissingFormulaException("Build One Formula: Formula size >=  2 is expected.");
		
		//AbstractFormula[] copy=this.isNull() ? formulas : new AbstractFormula[formulas.length+2];
		AbstractFormula[] copy = new AbstractFormula[formulas.length];
		BinaryFormula[] ands =  new AndFormula[copy.length];
		AbstractFormula[] tmp = new AbstractFormula[copy.length];
		
		/*if (!this.isNull()) {
			copy[0]=((AndFormula)this.right()).left();
			copy[1]=((AndFormula)this.left()).right();
			p=2;
		}*/

		for (int i=0,p=0;p<copy.length;p++,i++) copy[p]=formulas[i];
		for (int i=0;i<copy.length;i++){
			/*if (this.isNull()){
				if (i==0) ands[i]=new AndFormula(new NegFormula(copy[0]),copy[1]);
				else if (i==1) ands[i]=new AndFormula(copy[0],new NegFormula(copy[1]));
				else ands[i]=new AndFormula(copy[0],copy[1]);
			}
			else{
				if (i==0) ands[i]=(AndFormula)this.left();
				else if (i==1) ands[i]=(AndFormula)this.right();
				else ands[i]=new AndFormula(((AndFormula)this.right()).left(),((AndFormula)this.left()).right());
			}*/
			ands[i]=new AndFormula();
			for (int j=0;j<copy.length;j++){
				tmp[j]= (i!=j) ? new NegFormula(copy[j]) : copy[j];

			}
			ands[i]=ands[i].merge(tmp);
		}
		
		return new OrFormula().merge(ands);
	}


}
