
package loop;

import java.util.Scanner;

public class Prime
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter no for prime");
        final int n = sc.nextInt();
        boolean prime = true;
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (n < 2) {
            prime = false;
        }
        System.out.println("is prime " + prime);
        sc.close();
    }
}