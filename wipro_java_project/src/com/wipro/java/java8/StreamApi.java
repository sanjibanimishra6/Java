package com.wipro.java.java8;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {
 // Creating a list of strings
    List<String> list = Arrays.asList("Sanjibani", "Sushmita", "Bhumika");
    List<String> stream = list.stream().filter(name -> name.startsWith("B")).collect(Collectors.toList());
    System.out.println(stream);
    List<String> stream1 = list.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
System.out.println(stream1);


// Creating a list of integers
List<Integer> numbers = Arrays.asList(12, 25, 36, 48, 50);
List<Integer> sortedNumbers = numbers.stream()
.sorted()
.collect(Collectors.toList());
System.out.println("Sorted Numbers: " +sortedNumbers );
//Finding the maximum number
Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);
System.out.println("Maximum Number: " + maxNumber.orElse(null));

// Finding the minimum number
Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);
System.out.println("Minimum Number: " + minNumber.orElse(null));


    }

      
}