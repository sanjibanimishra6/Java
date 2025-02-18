package com.wipro.java.collection.treemap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FibonacciTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = scanner.nextInt();
        scanner.close();

        TreeMap<Integer, Long> fibonacciMap = new TreeMap<>();
        generateFibonacci(n, fibonacciMap);

        // Display the Fibonacci series stored in TreeMap
        System.out.println("Fibonacci Series stored in TreeMap:");
        for (Map.Entry<Integer, Long> entry : fibonacciMap.entrySet()) {
            System.out.println("Term " + entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void generateFibonacci(int n, TreeMap<Integer, Long> map) {
        long a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            map.put(i, a);
            long next = a + b;
            a = b;
            b = next;
        }
    }
}
