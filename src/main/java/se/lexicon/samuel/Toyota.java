package se.lexicon.samuel;

public class Toyota extends Car {
    private int roadServiceMonths;

        //all the properties inherited from the extended class
        //here you can pass the fields straight,since it is more specific
        //in this class we are specifying only the new field and can pass the values specific to car Toyota
    //Basically in this call, we define the car and the number of service months
    public Toyota(int roadServiceMonths) {
        super("Toyota", "4WD", 4, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    //ACCELERATING OR DECELERATING and this is unique to this toyota car
    //the method below can be passed to other cars
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changeGear(1);
        }else if (newVelocity > 0 && newVelocity <=10){
            changeGear(1);
        } else if(newVelocity > 10 && newVelocity <=20){
            changeGear(2);
        } else if(newVelocity > 20 && newVelocity <=30){
            changeGear(3);
        }else {
            changeGear(4);
        }
        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

}
