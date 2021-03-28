package whileLoop;

import java.util.Scanner;

public class Pelindrome
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int temp;
        int n = temp = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            final int rem = n % 10;
            sum = sum * 10 + rem;
            n /= 10;
        }
        if (sum == temp) {
            System.out.println("number is pelindrome");
        }
        else {
            System.out.println("number is not penildrome");
        }
        sc.close();
    }
}