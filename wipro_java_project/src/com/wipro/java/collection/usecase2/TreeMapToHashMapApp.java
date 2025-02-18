package com.wipro.java.collection.usecase2;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapToHashMapApp {
    public static void main(String[] args) {
        // Step 1: Creating a TreeMap and adding key-value pairs
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(101, "Alice");
        treeMap.put(105, "Bob");
        treeMap.put(102, "Charlie");
        treeMap.put(103, "David");
        treeMap.put(104, "Eve");

        // Printing TreeMap (Sorted order)
        System.out.println("TreeMap (Sorted Order): " + treeMap);

        // Step 2: Creating a HashMap and transferring data from TreeMap
        HashMap<Integer, String> hashMap = new HashMap<>(treeMap);

        // Printing HashMap (Unordered)
        System.out.println("HashMap (Unordered): " + hashMap);
    }
}
