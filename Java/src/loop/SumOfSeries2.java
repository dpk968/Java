package loop;

import java.util.Scanner;

public class SumOfSeries2
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter no of term");
        final int n = sc.nextInt();
        float sum = 0.0f;
        for (float i = 1.0f; i <= n; ++i) {
            sum += 1.0f / i;
        }
        System.out.println("sum of series is " + sum);
        sc.close();
    }
}