package oops;

public class Class
{
    public static void main(final String[] args) {
        final cat cat1 = new cat();
        final cat cat2 = new cat();
        cat1.legs = 4;
        cat1.eyes = 2;
        cat1.walk();
        cat2.eat();
        cat1.description();
    }
}