package com.company;

public  class Car extends Transport {
    private Marks marks;
    private double value;
    private  String color;

    @Override
    public Marks getMarks() {
        return marks;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public String getColor() {
        return color;
    }

    public Car(Marks marks, double value, String color) {
        this.marks = marks;
        this.value = value;
        this.color = color;


    }
    public String printInfo(){
        return (getColor()+" "+getValue()+" "+getMarks());

    }


    }

