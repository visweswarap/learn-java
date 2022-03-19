package org.claz.learn;

class Robo{
    String model;
    String make;
    String fuelType;

    void sayHello(String name){
        System.out.println("Hello " + name + ", Good morning");
    }

    void walk(){
        System.out.println("Walking to front...");
    }

    void stop(){
        System.out.println("Stopping...");
    }

    void sleepMode(){
        System.out.println("Shutting down...");
    }
}
