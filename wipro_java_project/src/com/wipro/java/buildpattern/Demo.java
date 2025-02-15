package com.wipro.java.buildpattern;


import com.wipro.java.buildpattern.builders.*;
import com.wipro.java.buildpattern.product.Car;
import com.wipro.java.buildpattern.product.Manual;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built: " + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\n" + carManual);
    }
}
