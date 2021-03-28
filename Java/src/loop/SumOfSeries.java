package loop;

import java.util.Scanner;

public class SumOfSeries
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter no of term");
        final int n = sc.nextInt();
        double sum1 = 0.0;
        double sum2 = 0.0;
        
        for (int i = 1; i <= n; ++i)
        {
        	if (i % 2 == 0)
        		System.out.print("-"+1 +"/"+ i +" ");
        	 else
        		 System.out.print(1 +"/"+ i +" ");
        }
                
        
        for (float i = 1.0f; i <= n; ++i) {
            if (i % 2.0f == 0.0f) {
                sum1 += 1.0f / i;
            }
            else {
                sum2 += 1.0f / i;
            }
        }
        System.out.println();
        final double sum3 = sum2 - sum1;
        System.out.println("sum of series is : " + sum3);
        sc.close();
    }
}