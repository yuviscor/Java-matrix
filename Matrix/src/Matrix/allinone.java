package Matrix;

import java.util.Scanner;
public class allinone {
	static Scanner scanner= new Scanner (System.in);
	public static void sumofmatrix(int[][] matrix1,int[][] matrix2,int row, int column) {
		int[][] matrix3= new int[row][column];
		for(int i=0; i<row;i++) {
			for(int j=0;j<column;j++) {
				matrix3[i][j]= matrix1[i][j] + matrix2[i][j];
				
			}
		}
		for(int i=0; i<row;i++) {
			for(int j=0;j<column;j++) {
		System.out.println(matrix3[i][j]);
			}
			System.out.println(" ");
		}
	}
	public static void multiofmatrix(int[][] matrix1,int[][] matrix2,int row, int column) {
		int[][] matrix4= new int[row][column];
		for(int i=0; i<row;i++) {
			for(int j=0;j<column;j++) {
				matrix4[i][j]= matrix1[i][j] * matrix2[j][i];
				
			}
		}
		for(int i=0; i<row;i++) {
			for(int j=0;j<column;j++) {
		System.out.println(matrix4[i][j]);
			}
			System.out.println(" ");
		}
	}
	public static void differenceofmatrix(int[][] matrix1,int[][] matrix2,int row, int column) {
		int[][] matrix5= new int[row][column];
		for(int i=0; i<row;i++) {
			for(int j=0;j<=column;j++) {
				matrix5[i][j]= matrix1[i][j] - matrix2[i][j];
				
			}
		}
		for(int i=0; i<row;i++) {
			for(int j=0;j<column;j++) {
		System.out.print(matrix5[i][j]);
			}
			System.out.println(" ");
		}
		
	}
	public static void divisonofmatrix(int[][] matrix1,int[][] matrix2,int row, int column) {
		int[][] matrix6= new int[row][column];
		for(int i=0; i<row;i++) {
			for(int j=0;j<=column;j++) {
				matrix6[i][j]= matrix1[i][j] / matrix2[i][j];
				
			}
		}
		for(int i=0; i<row;i++) {
			for(int j=0;j<column;j++) {
		System.out.print(matrix6[i][j]);
			}
			System.out.println(" ");
		}
		
	}
		
	public static void diagonaldifference(int[][] matrix1,int[][] matrix2,int row, int column) {
		int[][] matrix7= new int[row][column];
		for(int i=0; i<row;i++) {
			for(int j=i;j<=i;j++) {
				matrix7[i][j]= matrix1[i][j] - matrix2[i][j];
				
			}
		}
		for(int i=0; i<row;i++) {
			for(int j=0;j<column;j++) {
		System.out.print(matrix7[i][j]);
			}
			System.out.println(" ");
		}
		
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
	    System.out.println("ENTER THE SIZE OF ROW");
	    row=scanner.nextInt();
	    
		int column;
		System.out.println("ENTER THE SIZE OF COLUMN");
		column= scanner.nextInt();
		int i;
		int j;
		int[][] matrix1= new int[row][column];
		int[][] matrix2= new int[row][column];
		for(i=0; i<row;i++) {
			for(j=0;j<column;j++) {
				matrix1[i][j]= scanner.nextInt();
				
			}
		}

		for(i=0; i<row;i++) {
			for(j=0;j<column;j++) {
				matrix2[i][j]= scanner.nextInt();
				
			}
		}
		sumofmatrix(matrix1,matrix2,row,column);
		differenceofmatrix(matrix1,matrix2,row,column);
		divisonofmatrix(matrix1,matrix2,row,column);
		 multiofmatrix(matrix1,matrix2,row,column);
		diagonaldifference(matrix1,matrix2,row,column);

}
}