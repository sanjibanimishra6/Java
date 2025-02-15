package com.wipro.java.buildpattern.builders;
import com.wipro.java.buildpattern.product.CarType;
import com.wipro.java.buildpattern.product.Engine;
import com.wipro.java.buildpattern.product.GPSNavigator;
import com.wipro.java.buildpattern.product.Transmission;
import com.wipro.java.buildpattern.product.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}