package com.company;

public final class Motorbike  extends Truck {



    public Motorbike(Marks marks, double value, String color) {
        super(marks, value, color);


    }

    @Override
    public String carOwners() {
        String s ="the motorbike owner is called  Ostin ";
        return (s);
    }

    @Override
    public String printInfo() {
        return (super.printInfo());
    }
}
