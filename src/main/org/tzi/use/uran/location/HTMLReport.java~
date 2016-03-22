package org.tzi.use.uran.location;
import java.util.*;
import java.io.*;

public final class HTMLReport extends Report{
	private String file;
	private PrintWriter writer;
	List<Solution> solutions;
	
	public HTMLReport(String file, List<Solution> solutions){
		try{
			this.file = file;
			this.solutions = solutions;
			writer = new PrintWriter (new BufferedWriter (new FileWriter(this.file)));
			generate();
			writer.flush();
			writer.close();
		}
		catch(IOException e){
			System.err.println("Error:"+e.getMessage());
		}

	}

	private void head(){
		writer.println("<html> \n"); 
		writer.println("<head> \n");
		writer.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/helper.css\"/>");
		writer.println("</head> \n");
		writer.println("<body>\n");
	}

	public void generate(){
		head();
		solution();
		end();
	}

	private void solution(){
		for (int i=0;i<solutions.size();i++){
			writer.println("<span id=\"solution\"> Solution "+ (i+1) + ":</span>");
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

	private void end(){writer.println("\n</body></html>\n");}
	
	
}
