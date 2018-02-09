package com.company;

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to handle steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.
public class Vehicle {
    String vehicleName;
    int speed;

    public Vehicle(String vehicleName, int speed) {
        this.vehicleName = vehicleName;
        this.speed = speed;
    }

    public void accelerate(int increase) {
        this.speed += increase;
        System.out.println(this.speed + " is your new speed");
    }

    public void decelerate (int decrease) {
        int change = this.speed - decrease;
        if (change < 0) {
            this.speed = 0;
        } else {
            this.speed -= decrease;
        }
        System.out.println(this.speed + " is your new speed");
    }
}
