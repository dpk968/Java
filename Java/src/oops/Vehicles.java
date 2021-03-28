package oops;

class Vehicles
{
    int wheels;
    String color;
    
    Vehicles() {
        this.wheels = 4;
    }
    
    Vehicles(final int noOfWheels) {
        this.wheels = noOfWheels;
    }
    
    Vehicles(final int wheels, final String color) {
        this.wheels = wheels;
        this.color = color;
    }
}