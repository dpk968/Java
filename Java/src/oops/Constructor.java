package oops;

public class Constructor
{
    Constructor() {
        System.out.println("object is now created");
    }
    
    public static void main(final String[] args) {
        final Constructor obj = new Constructor();
        final Vehicles car = new Vehicles();
        System.out.println(String.valueOf(car.wheels) + " wheels");
        final Vehicles scooty = new Vehicles(2, "grey");
        System.out.println(String.valueOf(scooty.wheels) + " wheels and color is " + scooty.color);
    }
}