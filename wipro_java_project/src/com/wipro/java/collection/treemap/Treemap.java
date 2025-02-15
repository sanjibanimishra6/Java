package com.wipro.java.collection.treemap;
import java.util.*;

public class Treemap{
    
    // Creating a TreeMap
    static TreeMap<Integer, String> treeMap;

    // Method to create TreeMap
    static void createTreeMap() {
        treeMap = new TreeMap<>();
        System.out.println("TreeMap created successfully!");
    }

    // Method to insert elements into TreeMap
    static void insertElements() {
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(5, "Mango");
        treeMap.put(2, "Grapes");
        treeMap.put(4, "Orange");

        System.out.println("Elements inserted into TreeMap!");
    }

    // Method to search for a key
    static void searchByKey(int key) {
        if (treeMap.containsKey(key)) {
            System.out.println("Key " + key + " found with value: " + treeMap.get(key));
        } else {
            System.out.println("Key " + key + " not found!");
        }
    }

    // Method to search for a value
    static void searchByValue(String value) {
        if (treeMap.containsValue(value)) {
            System.out.println("Value \"" + value + "\" found in TreeMap.");
        } else {
            System.out.println("Value \"" + value + "\" not found!");
        }
    }

    // Method to remove a key-value pair
    static void removeElement(int key) {
        if (treeMap.containsKey(key)) {
            treeMap.remove(key);
            System.out.println("Key " + key + " removed successfully!");
        } else {
            System.out.println("Key " + key + " does not exist.");
        }
    }

    // Method to display all elements
    static void displayTreeMap() {
        System.out.println("\nDisplaying TreeMap Elements:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    // Method to demonstrate sorted order using a custom comparator
    static void sortedTreeMapDescendingOrder() {
        TreeMap<Integer, String> descTreeMap = new TreeMap<>(Collections.reverseOrder());
        descTreeMap.putAll(treeMap);

        System.out.println("\nTreeMap in Descending Order:");
        for (Map.Entry<Integer, String> entry : descTreeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    // Method to demonstrate synchronized TreeMap
    static void synchronizedTreeMap() {
        SortedMap<Integer, String> syncTreeMap = Collections.synchronizedSortedMap(new TreeMap<>(treeMap));

        synchronized (syncTreeMap) {
            System.out.println("\nSynchronized TreeMap Elements:");
            for (Map.Entry<Integer, String> entry : syncTreeMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        createTreeMap();
        insertElements();
        displayTreeMap();

        searchByKey(2);
        searchByKey(10);

        searchByValue("Mango");
        searchByValue("Pineapple");

        removeElement(3);
        displayTreeMap();

        sortedTreeMapDescendingOrder();
        synchronizedTreeMap();
    }
}
