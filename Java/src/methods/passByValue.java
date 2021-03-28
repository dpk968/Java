package methods;

public class passByValue
{
    static void swap(int a, int b) {
        final int temp = a;
        a = b;
        b = temp;
    }
    
    public static void main(final String[] args) {
        final int c = 5;
        final int d = 6;
        swap(c, d);
        System.out.println("c=" + c + "and d=" + d);
        System.out.println("After calling swap function");
        swap(5, 6);
        System.out.println("c=" + c + "and d=" + d);
    }
}