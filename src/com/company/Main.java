package com.company;
// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to handle steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.


public class Main {

    public static void main(String[] args) {
        Vehicle test = new Vehicle("Test", 0);
        test.accelerate(45);
        test.decelerate(50);

        Car rav4 = new Car("rav 4");
        rav4.accelerate(30);
        rav4.accelerate(30);

        rav4.decelerate(10);
        rav4.decelerate(10);
        rav4.decelerate(10);
        rav4.decelerate(10);
        rav4.decelerate(10);
        rav4.decelerate(10);

    }
}
