package strings;

import java.util.Scanner;

public class StringIntro
{
    public static void main(final String[] args) {
//        final String name2 = new String("my name is dpk");
        String name3 = "He is a very very good boy, isn't he?";
//        System.out.println(name3.charAt(0));
//        System.out.println(name3.length());
//        System.out.println(name3.substring(7));
//        System.out.println(name3.substring(2, 5));
        System.out.println(name3.contains("\'"));
        name3.replace(',', ' ');
        System.out.println(name3);
//        System.out.println(name3 == name2);
//        System.out.println(name3.equals(name2));
//        System.out.println(name3.isEmpty());
//        name3 = name3 + name3;
//        System.out.println(name3);
//        System.out.println(name3.concat("dpk"));
//        System.out.println(name3.replace('a', 'b'));
        name3.replace(',', ' ');
       System.out.println(name3.trim());//used to remove blank spaces
        final String[] c = name3.split("[^a-zA-Z]+");
        
        	for(int i=0;i<10;i++)
            {
                
                
            }
        	for(int i=0;i<c.length;i++)
        	{
        		System.out.println(c[i]);
        	}
        
//        System.out.println(name3.contains("dpk"));
        String[] array;
        for (int length = (array = c).length, i = 0; i < length; ++i) {
            final String e = array[i];
            System.out.print(e);
        }
//        System.out.println(name3.indexOf("dpk"));
//        System.out.println(name3.toUpperCase());
//        final String s = "       dev                ";
//        System.out.println(s.trim());
//        System.out.println(s);
        
        /* check reverse of a string  */
//        
//        
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//       
//        
//        String B = new StringBuilder(A).reverse().toString();
//        
//        if(A.equals(B))
//        {
//            System.out.println("Yes");
//        }
//        else
//        {
//            System.out.println("No");
//        }
//        sc.close();
//        
//       
    }
}