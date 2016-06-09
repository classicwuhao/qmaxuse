package org.tzi.use.uran.msc;

import java.util.List;
import java.util.ArrayList;
import org.tzi.use.uran.location.*;

public final class BoolMatrix{

	private List<Solution> solutions;
	private int[][] matrix;

	public BoolMatrix(List<Solution> solutions){
		this.solutions=solutions;	
		genMatrix();
	}
		
	private int[][] genMatrix(){
		Solution solution = solutions.get(0);
		int m = solutions.size();
		int n = solution.size();

		matrix = new int[m][n];
		for (int i=0;i<m;i++) for (int j=0;j<n;j++) matrix[i][j]=0;
		
		for (int i=0;i<solutions.size();i++){
			Solution s = solutions.get(i);
			for (int j=0;j<s.size();j++){
				Status t=s.get(j);
				if (!t.enabled()) matrix[i][j] = 1;
			}
		}

		return matrix;
	}
	
	public int[][] matrix(){return this.matrix;}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<matrix.length;i++){
			for (int j=0;j<matrix[i].length;j++){
				sb.append( (matrix[i][j] == 1) ? " 1 " : " 0 "  );
			}
			sb.append("\n");
		}
	
		return sb.toString();
	}
	
	
}
