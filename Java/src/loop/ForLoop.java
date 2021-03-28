package loop;

import java.util.Scanner;

public class ForLoop
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter any positive no");
        final int n = sc.nextInt();
        long fact = 1L;
        for (int i = 1; i <= n; ++i) {
            fact *= i;
        }
        System.out.println("factorial of " + n + " is: " + fact);
    }
}