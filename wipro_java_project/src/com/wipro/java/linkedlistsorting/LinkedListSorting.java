package com.wipro.java.linkedlistsorting;
import java.util.*;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.age, p2.age);  // Ascending order
    }
}

public class LinkedListSorting {
    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Sanji", 23));
        people.add(new Person("Sush", 22));
        people.add(new Person("Tushhh", 24));

        System.out.println("Before sorting:");
        for (Person p : people) {
            System.out.println(p);
        }

        // Sorting the linked list using Comparator
        people.sort(new AgeComparator());

        System.out.println("\nAfter sorting by age:");
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
