package strings;

public class AnagramsAnuj
{
    public static void main(final String[] args) {
        final String a = "a3456789ab";
        final String b = "a3456t7y8ba";
        boolean isAnagrams = true;
        final int[] al = new int[256];
        char[] charArray;
        for (int length = (charArray = a.toCharArray()).length, j = 0; j < length; ++j) {
            final int index;
            final char c = (char)(index = charArray[j]);
            final int[] array = al;
            final int n = index;
            ++array[n];
        }
        char[] charArray2;
        for (int length2 = (charArray2 = b.toCharArray()).length, k = 0; k < length2; ++k) {
            final int index;
            final char c = (char)(index = charArray2[k]);
            final int[] array2 = al;
            final int n2 = index;
            --array2[n2];
        }
        for (int i = 0; i < 256; ++i) {
            if (al[i] != 0) {
                isAnagrams = false;
                break;
            }
        }
        if (isAnagrams) {
            System.out.println("strings are anagrams");
        }
        else {
            System.out.println("strings are not anagrams");
        }
        
    }
}