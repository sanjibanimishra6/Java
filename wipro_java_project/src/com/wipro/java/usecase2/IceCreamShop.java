package com.wipro.java.usecase2;
import java.util.*;
import java.util.stream.Collectors;

// Abstract Class for Abstraction 
//Encapsulation  for IceCream class
abstract class IceCream {
    private String flavor;
    private double price;
    private String size; // Sizes like Small, Medium and Large

    // Constructor
    public IceCream(String flavor, double price, String size) {
        this.flavor = flavor;
        this.price = price;
        this.size = size;
    }

    // Getters
    public String getFlavor() {
        return flavor;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    // Abstract method 
    public abstract void IceCreamDetails();
}

// Inheritance 
class ConeIceCream extends IceCream {
    private String coneType; // for storing the type of the cone 

    public ConeIceCream(String flavor, double price, String size, String coneType) {
        super(flavor, price, size);
        this.coneType = coneType;
    }
//getter for coneType
    public String getConeType() {
        return coneType;
    }

    @Override
    public void IceCreamDetails() {
        System.out.println("Cone Ice Cream - Flavor: " + getFlavor() + " -Price: " + getPrice() +
                "  -Size: " + getSize() + "  -Cone Type: " + coneType);
    }
}

// Inheritance 
class CupIceCream extends IceCream {
    private String topping; 

    public CupIceCream(String flavor, double price, String size, String topping) {
        super(flavor, price, size);
        this.topping = topping;
    }
//getter for topping
    public String getTopping() {
        return topping;
    }

    @Override
    public void IceCreamDetails() {
        System.out.println("Cup Ice Cream - Flavor: " + getFlavor() + " - Price: " + getPrice() +
                " - Size: " + getSize() + " - Topping: " + topping);
    }
}

// Main Class
public class IceCreamShop {
    public static void main(String[] args) {
        // Using List to Store IceCream Objects
        List<IceCream> iceCreamList = new ArrayList<>();
        iceCreamList.add(new ConeIceCream("Vanilla", 4.5, "Medium", "Waffle Cone"));
        iceCreamList.add(new ConeIceCream("Chocolate", 5.0, "Large", "Sugar Cone"));
        iceCreamList.add(new CupIceCream("Strawberry", 4.0, "Small", "Chocolate Chips"));
        iceCreamList.add(new CupIceCream("Mango", 3.8, "Medium", "Nuts"));

        // Using Streams & Lambda to Filter Ice Creams with Price > $4
        System.out.println("Ice Creams priced above Rs.4.00:");
        iceCreamList.stream()
                .filter(i -> i.getPrice() > 4)
                .forEach(IceCream::IceCreamDetails);

        // Using Map to Store and Retrieve Ice Creams by Flavor
        Map<String, IceCream> iceCreamMap = iceCreamList.stream()
                .collect(Collectors.toMap(IceCream::getFlavor, i -> i, (i1, i2) -> i1));

        // Displaying Map Entries
        System.out.println("Ice Creams Stored in Map:");
        iceCreamMap.forEach((flavor, iceCream) -> {
            System.out.print(flavor + " -> ");
            iceCream.IceCreamDetails();
        });

        // Sorting Ice Creams by Price using Comparator & Streams
        System.out.println("Sorted Ice Creams by Price:");
        iceCreamList.stream()
                .sorted(Comparator.comparingDouble(IceCream::getPrice))
                .forEach(IceCream::IceCreamDetails);
    }
}
