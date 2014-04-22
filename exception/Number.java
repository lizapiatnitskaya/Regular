package exception;

public class Number {
	static void Operation( int n) throws MyClass{
		if (n>0){
			int[][] matrix1 = new int [n][n];
			for(int i=0; i<matrix1.length; i++) {
				  for(int j=0; j<matrix1[i].length; j++) {
				    matrix1[i][j] = (int)(Math.random()*10);
				  }
				}
			System.out.println("Matrix 1");
			for(int i=0; i<matrix1.length; i++) {
				  for(int j=0; j<matrix1[i].length; j++) {
				    System.out.print(matrix1[i][j] + "\t");
				  }
				  System.out.println(); 
				}
			int m = 3;
			int[][] matrix2 = new int [m][m];
			for(int i=0; i<matrix2.length; i++) {
				  for(int j=0; j<matrix2[i].length; j++) {
				    matrix2[i][j] = (int)(Math.random()*10);
				  }
				}
			System.out.println("Matrix 2");
			for(int i=0; i<matrix2.length; i++) {
				  for(int j=0; j<matrix2[i].length; j++) {
				    System.out.print(matrix2[i][j] + "\t");
				  }
				  System.out.println(); 
				}
			assert(m==n): "dimensions do not match";
			int[][] res = new int[m][m];
		
			for (int i = 0; i < m; i++) {
	            for (int j = 0; j < m; j++) {
	                for (int k = 0; k < n; k++) {
	                    res[i][j] += matrix1[k][i] * matrix2[j][k]; 
	                }
	            }
	        }
			System.out.println("Matrix 1 * Matrix 2");
			for(int i=0; i<matrix2.length; i++) {
				  for(int j=0; j<matrix2[i].length; j++) {
				    System.out.print(res[i][j] + "\t");
				  }
				  System.out.println(); 
				}
		}
		
		else {
			throw new MyClass("only positive!");
		}
	
		
		
		
	}
	public static void main(String[] args){
		try {
			Operation(3);
		}
		catch(MyClass e){
			System.err.print(e);
			
		}
		
	}

}
