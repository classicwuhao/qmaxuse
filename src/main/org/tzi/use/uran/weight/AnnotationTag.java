package org.tzi.use.uran.weight;


public class AnnotationTag{
	private String comments;
	private AbstractWeight weight;	
	private String name;
	
	public AnnotationTag(){;}
	/*public AnnotationTag(AnnotationTag tag){
		this.comments = tag.comments;
		this.weight = tag.getWeight();
		this.name = tag.getName();
	}*/
	public AnnotationTag(AbstractWeight weight, String comments){
		this.comments = comments;
		this.weight = weight;
	}
	
	public String getComments(){return this.comments;}
	public AbstractWeight getWeight(){return this.weight;}
	public String getName(){return this.name;}
	public void setName(String name){this.name=name;}
	public void setComments(String comments){this.comments=comments;}
	public void setWeight (AbstractWeight weight){this.weight=weight;}

	public String toString(){
		StringBuffer sb = new StringBuffer();
		if (this.name!=null) sb.append(this.name+" ");
		if (this.comments!=null) sb.append (this.comments+" ");
		if (this.weight!=null) sb.append(this.weight);
		if (sb.length()==0) sb.append("no rank");
		return sb.toString();
		//return "<"+this.name+" , "+this.comments+" , "+this.weight+">";
	}

}
