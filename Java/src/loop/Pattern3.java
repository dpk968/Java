package loop;

public class Pattern3
{
    public static void main(final String[] args) {
        for (int i = 1; i <= 10; ++i) {
            for (int j = 1; j <= i - 1; ++j) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 10 - i + 1; ++j) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}