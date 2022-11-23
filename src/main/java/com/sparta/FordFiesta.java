package com.sparta;

public class FordFiesta extends Car {
    @Override
    public void honk() {
        System.out.println("Fanfare horn sounds!");
    }

    // method overloading (compile time polymorphism)
    public void honk(String volume) {
        System.out.println("Hound sound is: " + volume);
    }

}
