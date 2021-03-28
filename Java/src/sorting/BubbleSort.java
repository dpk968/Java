package sorting;

public class BubbleSort
{
    public static void main(final String[] args) {
        final int[] a = { 2, 1, 8, -3, 1, 58, 98, 4, 12 };
        for (int n = a.length, i = 0; i < n - 1; ++i) {
            boolean sorted = true;
            for (int j = 0; j < n - 1 - i; ++j) {
                if (a[j] > a[j + 1]) {
                    final int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        System.out.println("The sorted array is:");
        int[] array;
        for (int length = (array = a).length, k = 0; k < length; ++k) {
            final int item = array[k];
            System.out.print(String.valueOf(item) + " ");
        }
    }
}