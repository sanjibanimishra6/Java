package com.wipro.java.linkedlist;
import java.util.Scanner;

//Node class
class Node {
 int data;
 Node next;

 public Node(int data) {
     this.data = data;
     this.next = null;
 }
}

//User-defined Linked List
class LinkedList {
 private Node head;

 // Insert at the end
 public void insertAtEnd(int data) {
     Node newNode = new Node(data);
     if (head == null) {
         head = newNode;
         return;
     }
     Node temp = head;
     while (temp.next != null) {
         temp = temp.next;
     }
     temp.next = newNode;
 }

 // Insert at the beginning
 public void insertAtBeginning(int data) {
     Node newNode = new Node(data);
     newNode.next = head;
     head = newNode;
 }

 // Delete a node by value
 public void deleteByValue(int value) {
     if (head == null) {
         System.out.println("List is empty!");
         return;
     }

     if (head.data == value) {
         head = head.next;
         return;
     }

     Node temp = head;
     while (temp.next != null && temp.next.data != value) {
         temp = temp.next;
     }

     if (temp.next != null) {
         temp.next = temp.next.next;
     } else {
         System.out.println("Value not found in the list!");
     }
 }

 // Search for a node
 public boolean search(int key) {
     Node temp = head;
     while (temp != null) {
         if (temp.data == key) return true;
         temp = temp.next;
     }
     return false;
 }

 // Display the list
 public void display() {
     if (head == null) {
         System.out.println("List is empty!");
         return;
     }
     Node temp = head;
     while (temp != null) {
         System.out.print(temp.data + " -> ");
         temp = temp.next;
     }
     System.out.println("null");
 }
}

//Driver class
public class UserDefinedLinkedList {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     LinkedList list = new LinkedList();

     while (true) {
         System.out.println("\nMenu:");
         System.out.println("1. Insert at End");
         System.out.println("2. Insert at Beginning");
         System.out.println("3. Delete by Value");
         System.out.println("4. Search for a Value");
         System.out.println("5. Display List");
         System.out.println("6. Exit");
         System.out.print("Enter your choice: ");
         
         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter value to insert at end: ");
                 int endValue = scanner.nextInt();
                 list.insertAtEnd(endValue);
                 break;
             case 2:
                 System.out.print("Enter value to insert at beginning: ");
                 int startValue = scanner.nextInt();
                 list.insertAtBeginning(startValue);
                 break;
             case 3:
                 System.out.print("Enter value to delete: ");
                 int deleteValue = scanner.nextInt();
                 list.deleteByValue(deleteValue);
                 break;
             case 4:
                 System.out.print("Enter value to search: ");
                 int searchValue = scanner.nextInt();
                 if (list.search(searchValue)) {
                     System.out.println(searchValue + " found in the list.");
                 } else {
                     System.out.println(searchValue + " not found in the list.");
                 }
                 break;
             case 5:
                 System.out.println("Linked List:");
                 list.display();
                 break;
             case 6:
                 System.out.println("Exiting...");
                 scanner.close();
                 return;
             default:
                 System.out.println("Invalid choice! Please try again.");
         }
     }
 }
}
