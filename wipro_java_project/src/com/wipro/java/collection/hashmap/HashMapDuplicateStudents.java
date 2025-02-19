package com.wipro.java.collection.hashmap;
import java.util.*;

class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber;
    }
}

public class HashMapDuplicateStudents {
    public static void main(String[] args) {
        Map<Integer, List<Student>> studentMap = new HashMap<>();

        // Creating 10 students with duplicate names and roll numbers
        Student[] students = {
            new Student("Alice", 101),
            new Student("Bob", 102),
            new Student("Charlie", 103),
            new Student("Alice", 101), // Duplicate name and roll number
            new Student("Eve", 104),
            new Student("Bob", 102), // Duplicate name and roll number
            new Student("Grace", 105),
            new Student("Charlie", 103), // Duplicate name and roll number
            new Student("Ivy", 106),
            new Student("Jack", 107)
        };

        // Storing students in HashMap
        for (Student student : students) {
            studentMap.computeIfAbsent(student.rollNumber, k -> new ArrayList<>()).add(student);
        }

        // Displaying the HashMap
        for (Map.Entry<Integer, List<Student>> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
