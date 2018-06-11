package com.company;

public class Car extends Vehicle{
    /*
        variables of the car class
    */
    private String color;
    private String make;
    private String model;
    private int year;
    private double weight;

/*Getter and setter for all the variables of the car class
so that the values can be*/
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



/*methods from the parent class
  that can be override*/
    @Override
   public void setSpeed(int speed){
        this.speed = speed;
    }

    @Override
    public String accelerate() {
        return "The "+ getColor()+" "+ getMake() +super.accelerate();
    }

    @Override
    public String start() {
        return "The " + getColor()+" "+ getMake() +super.start();
    }

    @Override
    public String stop() {
        return "The " + getColor()+" "+ getMake() +super.stop();
    }

    @Override
    public String readSpeed() {
     return  super.readSpeed();
    }
    /*
        car class methods that are unique to itself
    */

}
