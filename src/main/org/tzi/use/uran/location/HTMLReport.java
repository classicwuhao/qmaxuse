package org.tzi.use.uran.location;
import java.util.*;
import java.io.*;

public final class HTMLReport extends Report{
	private String file;
	private PrintWriter writer;
	private List<Solution> solutions;
	private List<List<Status>> conflicts;
	private List<Status> single;
	
	public HTMLReport(String file, List<Solution> solutions){
		try{
			this.file = file;
			this.solutions = solutions;
			writer = new PrintWriter (new BufferedWriter (new FileWriter(this.file)));
			//generate();
		}
		catch(IOException e){
			System.err.println("Error:"+e.getMessage());
		}
	}
	
	public void finalise(){
		writer.flush();
		writer.close();
	}
	
	private void head(){
		writer.println("<html> \n");
		writer.println("<head> \n");
		writer.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/helper.css\"/>");
		writer.println("</head> \n");
		writer.println("<body>\n");
		writer.println("<p>");
		writer.println("Total Max Weighted Solution(s): "+solutions.size());
		writer.println("</p>");
		if (conflicts==null) return;
		//writer.println("Conflict(s) detection is switched off.");
		writer.println("<p>");
		writer.println("Total Conflict(s): "+(conflicts.size()+single.size()));
		writer.println("</p>");
	}
	
	public void generate(){
		head();
		solution();
		genReport4Conflicts();
		end();
	}

	private void solution(){
		for (int i=0;i<solutions.size();i++){
			writer.println("<span id=\"solution\"> Max Weighted Solution "+ (i+1) + ":</span>");
			table(solutions.get(i));
			writer.println("<p></p>");
		}
	}

	private void table(Solution solution){
		int weight=0;
		writer.println("<table id=\"entry\">");
		writer.println("<tr>");
		writer.println("<th> Name </th>");
		writer.println("<th> Type </th>");
		writer.println("<th> Status </th>");
		writer.println("<th> Weight </th>");
		writer.println("</tr>");
		for (int i=0;i<solution.size();i++){
			writer.println("<tr>");
			if (solution.get(i).getType()==Status.CLASS)
				writer.println("<td id=\"cls\">"+ solution.get(i).name() +"</td>");
			else if (solution.get(i).getType()==Status.INVAR)
				writer.println("<td id=\"inv\">"+ solution.get(i).name() +"</td>");
			else if (solution.get(i).getType()==Status.ASSOC)
				writer.println("<td id=\"assoc\">"+ solution.get(i).name() +"</td>");
			else
				writer.println("<td id=>"+ solution.get(i).name() +"</td>");

			/* type */
			if (solution.get(i).getType()==Status.CLASS)
				writer.println("<td> CLASS </td>");
			else if (solution.get(i).getType()==Status.INVAR)
				writer.println("<td> INVAR </td>");
			else if (solution.get(i).getType()==Status.ASSOC)
				writer.println("<td> ASSOC </td>");
			else
				writer.println("<td> UNKNOWN </td>");

			if (solution.get(i).enabled())
				writer.println("<td id=\"on\"> ON </td>");
			else
				writer.println("<td id=\"off\"> OFF </td>");

			weight+=solution.get(i).weight();
			if (solution.get(i).weight()>0)
				writer.println("<td id=\"weight-available\">"+ solution.get(i).weight() +"</td>");
			else
				writer.println("<td id=\"weight-unavailable\"> NA </td>");

			writer.println("</tr>");
		}
		writer.println("<tr>");
		writer.println("<td id=\"weight-total\"> </td>\n<td id=\"weight-total\"> </td> \n <td id=\"weight-total\"> </td>");
		writer.println("<td id=\"weight-total\">"+"Total: "+weight+"</td>");
		writer.println("</tr>");
		writer.println("</table>");
		
	}
	
	public void addConflicts (List<List<Status>> sets){
		this.conflicts = sets;
	}
	
	public void addSingleConflicts(List<Status> single){
		this.single = single;
	}

	private void genReport4Conflicts(){
		int counter =0;
		if (conflicts==null) return;
		for (int i=0;i<conflicts.size();i++,counter++){
			writer.println("<span id=\"conflict\"> Conflict "+ (i+1) + ":</span>");
			List<Status> conflict = conflicts.get(i);
			writer.print("(");
			for (int j=0;j<conflict.size()-1;j++){
				writer.print(conflict.get(j).name()+",");	
			}
			writer.println(conflict.get(conflict.size()-1).name()+")");
			writer.println("<p></p>");
		}
		
		counter++;
		if (this.single==null) return;
		for (int i=0;i<single.size();i++,counter++){
			writer.println("<span id=\"conflict\"> Conflict "+ counter + ":</span>");
			writer.print("("+single.get(i).name()+")");
			writer.println();
			writer.println("<p></p>");
		}
		
	}

	private void end(){writer.println("\n</body></html>\n");}
	
	
}
