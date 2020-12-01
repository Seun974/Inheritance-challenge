package se.lexicon.samuel;

//this is more like the general attributes
public class Vehicle {
    private String name;
    private String size;

    //this is to help us no the speed and direction of all the vehicles
    private int currentVelocity;
    private int currentDirection;


    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }
    //this changes relatively with the direction
    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    //this will implement the stop option for the vehicle
    public void stop(){
        this.currentVelocity = 0;
    }


}


