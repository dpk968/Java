package loop;

import java.util.Scanner;

public class Fibb
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter any positive no");
        final int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(String.valueOf(a) + " " + b + " ");
        for (int i = 0; i < n - 2; ++i) {
            final int c = a + b;
            System.out.print(String.valueOf(c) + " ");
            a = b;
            b = c;
        }
    }
}