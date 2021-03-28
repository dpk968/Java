package sorting;

public class SelectioonSort
{
    public static void main(final String[] args) {
        final int[] a = { 2, 1, 8, -3, 1, 58, 98, 4, 12 };
        final int n = a.length;
        for (int i = 0; i < n - 1; ++i) {
            int min = i;
            for (int j = i; j < n; ++j) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            final int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        System.out.println("The sorted array is:");
        for (int i = 0; i < n; ++i) {
            System.out.print(String.valueOf(a[i]) + " ");
        }
    }
}