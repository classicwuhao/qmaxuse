package org.tzi.use.common;
import org.tzi.use.uml.mm.*;
import uran.formula.AbstractFormula;

public interface ITranslator {
	public void TranslateClass(MClass cls);
	public void TranslateAttribute(MAttribute attr);
	public void TranslateAssociation(MAssociation assoc);
	public AbstractFormula TranslateInvariant (MClassInvariant inv);
}
