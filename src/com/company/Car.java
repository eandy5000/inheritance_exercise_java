package com.company;

/**
 * Created by eandreweccleston on 2/14/18.
 */
public class Car extends Vehicle {
    private int gear = 1;
    private String make;

    public Car(String make) {
        super("Car", 0);
        this.gear = gear;
        this.make = make;

        this.setVehicleName(this.make);
    }

    private void upShift() {
        int gearCheck = this.gear;

        if(this.getSpeed() >= 10 && this.getSpeed() <= 29) {
            this.gear = 2;
        } else if (this.getSpeed() >= 30 && this.getSpeed() <= 39) {
            this.gear = 3;
        } else {
            this.gear = 4;
        }

        if(this.gear != gearCheck) {
            System.out.println(this.make + " has shifted into "+ this.gear);
        } else {
            System.out.println(this.make + " is in "+ this.gear);

        }
    }

    private void downShift() {
        int gearCheck = this.gear;


        if(this.getSpeed() < 10) {
            this.gear = 1;
        } else if (this.getSpeed() >= 10 && this.getSpeed() <= 29) {
            this.gear = 2;
        } else if (this.getSpeed() >= 30 && this.getSpeed() <= 39){
            this.gear = 3;
        } else {
            this.gear = 4;
        }

        if(this.gear != gearCheck) {
            System.out.println(this.make + " has down-shifted into "+ this.gear);
        } else {
            System.out.println(this.make + " is in "+ this.gear);

        }
    }

    @Override
    public void accelerate(int increase) {
        super.accelerate(increase);
        this.upShift();
    }

    @Override
    public void decelerate (int decrease) {
        super.decelerate(decrease);
        this.downShift();
    }
}
