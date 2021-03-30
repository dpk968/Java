package strings;

import java.util.Scanner;

public class StringIntro
{
    public static void main(final String[] args) {
        final String name2 = new String("my name is dpk");
        String name3 = "my name is dpk";
        System.out.println(name3.charAt(0));
        System.out.println(name3.length());
        System.out.println(name3.substring(7));
        System.out.println(name3.substring(8, 12));
        System.out.println(name3.contains("dpk"));
        System.out.println(name3 == name2);
        System.out.println(name3.equals(name2));
        System.out.println(name3.isEmpty());
        name3 = String.valueOf(name3) + " gupta";
        System.out.println(name3);
        System.out.println(name3.concat("dpk"));
        System.out.println(name3.replace('a', 'b'));
        final String[] c = name3.split("d");
        System.out.println(name3.contains("dpk"));
        String[] array;
        for (int length = (array = c).length, i = 0; i < length; ++i) {
            final String e = array[i];
            System.out.println(e);
        }
        System.out.println(name3.indexOf("dpk"));
        System.out.println(name3.toUpperCase());
        final String s = "       dev                ";
        System.out.println(s.trim());
        System.out.println(s);
        
        /* check reverse of a string  */
        
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
       
        
        String B = new StringBuilder(A).reverse().toString();
        
        if(A.equals(B))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        sc.close();
        
        
        
        
        
        
        
        
        
        
    }
}