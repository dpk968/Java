package methods;

import java.util.Scanner;

public class method
{
    static int fact(final int n) {
        if (n < 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
    
    public static void main(final String[] args) {
        System.out.println("enter any positive no");
        final Scanner sc = new Scanner(System.in);
        final int num = sc.nextInt();
        final int y = fact(num);
        System.out.println("factorial of given number is " + y);
        sc.close();
    }
}