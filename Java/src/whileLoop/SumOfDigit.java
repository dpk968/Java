package whileLoop;

import java.util.Scanner;

public class SumOfDigit
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NO");
        final int n = sc.nextInt();
        final int numOfDigits = (int)Math.log10(n) + 1;
        System.out.println("number of digit is " + numOfDigits);
        sc.close();
    }
}