package se.lexicon.samuel;

//so this class is unique to cars and will inherit stuff from the general vehicle class
public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1; //setting it out directly like the car is at default at 1
    }

    //this setter will be used to change the current gear already set to default 1
    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): changed to " + this.currentGear + " gear. ");
    }
    //this method takes the new input and changes it with wat is in move set in the general class vehicle
    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed, direction);
    }

    //overriding the stop method here



}
