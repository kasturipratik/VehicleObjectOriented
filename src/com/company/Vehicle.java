package com.company;

public class Vehicle {

    public int numberOfWheels;
    public String engineType;
    public int speed;

    /*
        Getter and Setter for the private variables to call in the main method
    */
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    /*
                     Constructor
                */
    public Vehicle(){

    }

    /*
        methods for the child classes to inherit
    */
    public String start(){
        return " is starting...";
    }
    public String accelerate(){
        return " is accelerating";
    }

    public String readSpeed(){
      return "This vehicle is going "+ getSpeed() +" mph...";
    }
    public String stop(){
        return " Stop";
    }
}
