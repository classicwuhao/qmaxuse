package org.tzi.use.uran.msc;

import java.util.List;
import java.util.ArrayList;
import org.tzi.use.uran.location.*;

public final class BoolMatrix{

	private List<Solution> solutions;
	private List<Solution> newsolutions = new ArrayList<Solution>();
	
	private int[][] matrix;

	public BoolMatrix(List<Solution> solutions){
		this.solutions=solutions;	
		this.matrix=genMatrix();
	}
		
	private int[][] genMatrix(){
		Solution solution = solutions.get(0);
		int m = solutions.size();
		int n = solution.size();

		matrix = new int[m][n];
		int[] index = new int[n];
		
		for (int i=0;i<n;i++) index[i]=-1;
		for (int i=0;i<m;i++) for (int j=0;j<n;j++) matrix[i][j]=0;
		
		
		for (int i=0;i<solutions.size();i++){
			Solution s = solutions.get(i);
			for (int j=0;j<s.size();j++){
				Status t=s.get(j);
				if (!t.enabled()) matrix[i][j] = 1;
			}
		}
		
		if (solutions.size()==1) {
			this.newsolutions=this.solutions;
			return matrix;
		}

		/* take out the columns that have all 1s */
		boolean flag=true;
		int k=0;
		int[][] bmatrix= new int[m][n];

		for (int i=0,c=0;i<matrix[0].length;i++){
			flag=true;
			for (int j=0;j<matrix.length;j++){
				if (matrix[j][i]==0) {flag=false;break;}
			}

			if (!flag){
				for (int p = 0;p<bmatrix.length;p++) bmatrix[p][k]=matrix[p][i];
				k++;
			}else{
				index[c++]=i;
				//System.out.println("i:"+i);
				/*for (int p=0;p<solutions.size();p++)
					solutions.get(p).remove(i);*/
			}
		}
		
		/* create a new set of solutions without all 1s in the columns */
		for (int i=0;i<solutions.size();i++){
			Solution s = solutions.get(i);
			Solution sol = new Solution();
			for (int l=0;l<s.size();l++){
				if (index[0]!=-1){ // no columns with all 1s.
					for (int j=0;index[j]!=-1;j++) {
						if (l!=index[j]){
							Status stat = s.get(l);
							sol.addStatus(stat);
						}
					}
				}
				else{
					sol.addStatus(s.get(l));
				}
			}
			newsolutions.add(sol);
		}
		
		int[][] new_matrix = new int[m][k];
		
		for (int i=0;i<bmatrix.length;i++)
			for (int j=0;j<k;j++) new_matrix[i][j]=bmatrix[i][j];
		
		//System.out.println();

		return new_matrix;
	}
	
	public int[][] matrix(){return this.matrix;}
	public List<Solution> getSolutions(){return this.newsolutions;}
	
	public String name(){
		StringBuilder sb = new StringBuilder();
		
		for (int i=0;i<solutions.size();i++){
			Solution s = solutions.get(i);
			for (int j=0;j<s.size();j++){
				Status t= s.get(j);
				sb.append( (t.enabled() ? t.name()+"("+0+") "  : t.name()+"("+1+") " ) );
			}
			sb.append("\n");
		}
		return sb.toString();
	}

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
