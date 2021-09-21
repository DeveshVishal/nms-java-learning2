package collectionFrameWork;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int matrix[][] = {  {22, 44, 41, 84},
							{68, 12, 71, 33},	
							{94, 14, 45, 31},
							{88, 77, 64, 69}
						  };
		
		
		System.out.println("Enter Number to print Number arround that");
		
		int key = in.nextInt();
		
		for(int i = 0; i<matrix.length; i++) {
			for(int j = 0; j<matrix[0].length; j++) {
				
				if(matrix[i][j] == key) {
					
					if(i == 0) {
						if(j == 0) {
							System.out.print(matrix[i+1][j]+ " ");
							System.out.print(matrix[i][j+1]+ " ");
						}
						else if(j == matrix[0].length-1) {
							System.out.print(matrix[i][j-1]+ " ");
							System.out.print(matrix[i+1][j]+ " ");
						}
						else {
							System.out.print(matrix[i][j+1]+ " ");
							System.out.print(matrix[i][j-1]+ " ");
							System.out.print(matrix[i+1][j]+ " ");
							
						}
					}
					else if(i == matrix.length-1) {
						if(j == 0) {
							System.out.print(matrix[i-1][j]+ " ");
							System.out.print(matrix[i][j+1]+ " ");
						}
						else if(j == matrix[0].length-1) {
							System.out.print(matrix[i][j-1]+ " ");
							System.out.print(matrix[i-1][j]+ " ");
						}
						else {
							System.out.print(matrix[i][j+1]+ " ");
							System.out.print(matrix[i][j-1]+ " ");
							System.out.print(matrix[i-1][j]+ " ");
							
						}
					}
					else if(j == 0){
						System.out.print(matrix[i-1][j]+ " ");
						System.out.print(matrix[i+1][j]+ " ");
						System.out.print(matrix[i][j+1]+ " ");
					}
					else if(j == matrix[0].length-1) {
						System.out.print(matrix[i+1][j]+ " ");
						System.out.print(matrix[i-1][j]+ " ");
						System.out.print(matrix[i][j-1]+ " ");
					}
					else {
						System.out.print(matrix[i+1][j]+ " ");
						System.out.print(matrix[i-1][j]+ " ");
						System.out.print(matrix[i][j-1]+ " ");
						System.out.print(matrix[i][j+1]+ " ");
					}
					
				}
			}
		}

	}

}
