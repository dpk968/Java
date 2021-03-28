package loop;

import java.util.Scanner;

public class PowerForLoop
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 number");
        final int x = sc.nextInt();
        final int y = sc.nextInt();
        int res = 1;
        for (int i = 0; i < y; ++i) {
            res *= x;
        }
        System.out.println(res);
        sc.close();
    }
}