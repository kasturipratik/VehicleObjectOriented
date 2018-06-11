package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car userCar = new Car();
        userCar.setColor("red");
        userCar.setMake("Porsche");
        userCar.setSpeed(90);

         Car newCar = new Car();
         newCar.setColor("blue");
         newCar.setMake("Jetta");
         newCar.setSpeed(90);


        print(userCar.start());
        print(newCar.start());

        print(userCar.accelerate());
        print(newCar.accelerate());

        print(userCar.readSpeed());
        print(newCar.readSpeed());

        print(userCar.stop());
        print(newCar.stop());
    }
    public static void print(String s){
        System.out.println(s);
    }
}
