package loop;

public class Table
{
    public static void main(final String[] args) {
        for (int i = 1; i <= 10; ++i) {
            for (int j = 1; j <= 20; ++j) {
                System.out.print(String.valueOf(j * i) + "| ");
            }
            System.out.println();
        }
    }
}