package com.company;

public class Truck extends Car {

    public Truck(Marks marks, double value, String color) {
        super(marks, value, color);
    }


   final String calculateKms(){
        return ("Josoph goes 10000 kms for a year!");
    }



   public String carOwners(){
        return ("the truck owner is called Josoph");
    }


    @Override
    public String printInfo() {
        return (super.printInfo());
    }
}
