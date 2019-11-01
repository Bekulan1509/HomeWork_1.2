package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------");

        Car c1= new Car(Marks.HONDA, 2.4, "серебро");

        System.out.println(c1.printInfo());

        System.out.println("------------------------------------------------------------------");


        Truck c2 = new Truck(Marks.VOLVO, 6.5, "черный");
        System.out.println(c2.printInfo());
        System.out.println(c2.calculateKms());
        System.out.println(c2.carOwners());

        System.out.println("------------------------------------------------------------------");

        Motorbike c3 = new Motorbike(Marks.YAMAHA, 1.3, "серый");
        System.out.println(c3.printInfo());
        System.out.println(c3.carOwners());
        System.out.println("------------------------------------------------------------------");



    }
}
