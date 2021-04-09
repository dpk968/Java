package strings;

public class Anagram
{
    public static void main(final String[] args) {
        int count = 0;
        final String a = "cat";
        final String b = "acct";
        for (int i = 0; i < a.length(); ++i) {
            final char t = a.charAt(i);
            for (int j = 0; j < b.length(); ++j) {
                final char t2 = b.charAt(j);
                if (t == t2) {
                    ++count;
                    break;
                }
            }
        }
        if (count == 3) {
            System.out.println("strings are anagrams");
        }
        else {
            System.out.println("strings are not anagrams");
        }
    }
}