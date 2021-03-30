package arrays;

import java.util.Scanner;

public class TwoDArray {

	public static void main(final String[] args) {
		
		
        final Scanner sc = new Scanner(System.in);
        
        System.out.println("enter no of rows");
        final int row = sc.nextInt();
        
        System.out.println("enter no of coloumn");
        final int col = sc.nextInt();
        
        final int[][] a = new int[row][col];
        final int[][] b = new int[row][col];
        final int[][] c = new int[row][col];
        
        
        System.out.println("enter matrix A");
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter matrix B");
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("the Addition of matrix is:");
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                System.out.print(String.valueOf(c[i][j]) + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
