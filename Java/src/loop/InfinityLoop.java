package loop;

import java.util.Scanner;

public class InfinityLoop
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("enter any no");
            n = sc.nextInt();
        } while (n >= 0);
        sc.close();
    }
}