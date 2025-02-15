package com.wipro.java.collection.hashmap;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

class Hashmap {
    public static void main(String[] args) {
        // 1. Creating a HashMap
        HashMap<Integer, String> languages = new HashMap<>();
        
        // 2. Adding elements using put()
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        System.out.println("Initial HashMap: " + languages);

        // 3. Access elements using get()
        System.out.println("Value for key 1: " + languages.get(1));

        // 4. Access keys, values, and entries
        System.out.println("Keys: " + languages.keySet());
        System.out.println("Values: " + languages.values());
        System.out.println("Entries: " + languages.entrySet());

        // 5. Modify an element using replace()
        languages.replace(2, "C++");
        System.out.println("HashMap after replace(): " + languages);

        // 6. Remove an element
        String removedValue = languages.remove(2);
        System.out.println("Removed value: " + removedValue);
        System.out.println("HashMap after remove(): " + languages);

        // 7. Iterating through a HashMap
        System.out.print("Keys: ");
        for (Integer key : languages.keySet()) {
            System.out.print(key + ", ");
        }
        System.out.print("\nValues: ");
        for (String value : languages.values()) {
            System.out.print(value + ", ");
        }
        System.out.print("\nEntries: ");
        for (Entry<Integer, String> entry : languages.entrySet()) {
            System.out.print(entry + ", ");
        }
        System.out.println();

        // 8. Creating a HashMap from another Map
        TreeMap<String, Integer> evenNumbers = new TreeMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("TreeMap: " + evenNumbers);

        HashMap<String, Integer> numbers = new HashMap<>(evenNumbers);
        numbers.put("Three", 3);
        System.out.println("HashMap from TreeMap: " + numbers);

        // 9. Using initial capacity and load factor
        HashMap<String, Integer> customHashMap = new HashMap<>(8, 0.6f);
        customHashMap.put("One", 1);
        customHashMap.put("Two", 2);
        System.out.println("Custom HashMap: " + customHashMap);
    }
}
