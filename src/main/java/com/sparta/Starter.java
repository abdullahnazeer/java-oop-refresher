package com.sparta;

public class Starter {

    public static void main() {
        Car newCar = new Car();
//        newCar.honk();

        Car pinkFordFocus = new FordFocus();

        FordFiesta pinkFordFiesta = new FordFiesta();

//        pinkFordFocus.honk();
//        pinkFordFiesta.honk();
//        newCar.honk();

//        Car[] carArr = {pinkFordFocus, pinkFordFiesta, newCar};
//
//        for (Car car : carArr){
//            car.honk();             // method used is determined at runtime
//        }

        System.out.println(newCar.getNumberOfWheels());
        System.out.println(newCar.getColour());
        newCar.setColour("green");
        System.out.println(newCar.getColour());

        // method overloading (compile time polymorphism)
        pinkFordFiesta.honk();
        pinkFordFiesta.honk("extra loud!");
    }
}
