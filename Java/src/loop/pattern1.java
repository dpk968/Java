package loop;

import java.util.Scanner;

public class pattern1
{
    public static void main(final String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter any number");
    	int n = sc.nextInt();
    	
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (j <= i) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}