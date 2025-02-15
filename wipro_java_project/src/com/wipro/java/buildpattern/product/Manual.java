package com.wipro.java.buildpattern.product;

public class Manual {
    private final CarType type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType type, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    @Override
    public String toString() {
        return "Car manual built:\n" +
               "Type: " + type + "\n" +
               "Seats: " + seats + "\n" +
               "Engine: " + engine.getVolume() + "L\n" +
               "Transmission: " + transmission + "\n" +
               "Trip Computer: " + (tripComputer != null ? "Functional" : "Not available") + "\n" +
               "GPS Navigator: " + (gpsNavigator != null ? "Functional" : "Not available");
    }
}
