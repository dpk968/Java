
package methods;

import java.util.Scanner;

public class fabboachi
{
    static int fabb(final int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fabb(n - 1) + fabb(n - 2);
    }
    
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter any no");
        final int numOfTerm = sc.nextInt();
        System.out.println("fabbonachii series is:");
        for (int i = 0; i < numOfTerm; ++i) {
            final int y = fabb(i);
            System.out.print(String.valueOf(y) + " ");
        }
        sc.close();
    }
}