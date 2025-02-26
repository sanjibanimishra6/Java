package com.wipro.java.practice.usecase2;
import java.util.LinkedList;
import java.util.Scanner;

// Generic Stack Implementation using Linked List
class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Adds the specified item to the top of the stack
    public void push(T item) {
        list.addFirst(item);
    }

    // Removes and returns the item from the top of the stack
    // Returns null if the stack is empty
    public T pop() {
        return list.isEmpty() ? null : list.removeFirst();
    }

    // Returns the item from the top of the stack without removing it
    // Returns null if the stack is empty
    public T peek() {
        return list.isEmpty() ? null : list.getFirst();
    }

    // Returns true if the stack is empty, and false otherwise
    public boolean isEmpty() {
        return list.isEmpty();
    }
}

// Main class to test the stack implementation
public class Main {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        // Input integers until a non-integer is entered
        while (scanner.hasNextInt()) {
            int userInput = scanner.nextInt();
            integerStack.push(userInput);
        }

        // Display integer stack operations
        System.out.println("Peek: " + integerStack.peek());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Is Empty: " + integerStack.isEmpty());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Is Empty: " + integerStack.isEmpty());

        // Input strings until an empty string is entered
        Stack<String> stringStack = new Stack<>();
        scanner.nextLine(); // Consume remaining newline

        System.out.println("Enter strings to push onto the stack (enter an empty string to stop)");
        while (scanner.hasNextLine()) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                break;
            }
            stringStack.push(userInput);
        }

        // Display string stack operations
        System.out.println("Peek: " + stringStack.peek());

        scanner.close();
    }
}