package oops;

class cat
{
    boolean hasFur;
    String color;
    String breed;
    int legs;
    int eyes;
    
    public void walk() {
        System.out.println("Cat can walk");
    }
    
    public void eat() {
        System.out.println("Cat can eat");
    }
    
    public void description() {
        System.out.println("my cat has " + this.legs + " legs and my cat has " + this.eyes + " eyes");
    }
}