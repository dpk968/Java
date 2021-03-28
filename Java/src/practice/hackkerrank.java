package practice;

import java.util.Scanner;

public class hackkerrank
{
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        final int i = scan.nextInt();
        final double d = scan.nextDouble();
        final String s = scan.next();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}