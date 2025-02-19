package com.wipro.java.collection.hashmap;
//Node class for storing key-value pairs
class Node<K, V> {
 K key;
 V value;
 Node<K, V> next; // For handling collisions using linked list

 public Node(K key, V value) {
     this.key = key;
     this.value = value;
     this.next = null;
 }
}

//Custom HashMap class
class MyHashMap<K, V> {
 private static final int INITIAL_CAPACITY = 16; // Default size
 private Node<K, V>[] buckets; // Array of linked lists
 private int size;

 @SuppressWarnings("unchecked")
 public MyHashMap() {
     buckets = new Node[INITIAL_CAPACITY];
     size = 0;
 }

 // Hash function
 private int getBucketIndex(K key) {
     return Math.abs(key.hashCode()) % buckets.length;
 }

 // Put method (Insert or Update)
 public void put(K key, V value) {
     int index = getBucketIndex(key);
     Node<K, V> head = buckets[index];

     // Check if key already exists, update value
     Node<K, V> temp = head;
     while (temp != null) {
         if (temp.key.equals(key)) {
             temp.value = value; // Update value
             return;
         }
         temp = temp.next;
     }

     // Insert new node at head (Separate chaining)
     Node<K, V> newNode = new Node<>(key, value);
     newNode.next = head;
     buckets[index] = newNode;
     size++;
 }

 // Get method (Retrieve value by key)
 public V get(K key) {
     int index = getBucketIndex(key);
     Node<K, V> temp = buckets[index];

     while (temp != null) {
         if (temp.key.equals(key)) {
             return temp.value;
         }
         temp = temp.next;
     }
     return null; // Key not found
 }

 // Remove method (Delete key-value pair)
 public void remove(K key) {
     int index = getBucketIndex(key);
     Node<K, V> head = buckets[index];

     if (head == null) return; // Key not found

     // If head node is to be deleted
     if (head.key.equals(key)) {
         buckets[index] = head.next;
         size--;
         return;
     }

     // Search for the key in the linked list
     Node<K, V> prev = head;
     Node<K, V> current = head.next;
     while (current != null) {
         if (current.key.equals(key)) {
             prev.next = current.next;
             size--;
             return;
         }
         prev = current;
         current = current.next;
     }
 }

 // ContainsKey method (Check if key exists)
 public boolean containsKey(K key) {
     return get(key) != null;
 }

 // Size method (Return number of key-value pairs)
 public int size() {
     return size;
 }

 // Display the HashMap
 public void display() {
     for (int i = 0; i < buckets.length; i++) {
         Node<K, V> temp = buckets[i];
         if (temp != null) {
             System.out.print("Bucket " + i + ": ");
             while (temp != null) {
                 System.out.print("[" + temp.key + " -> " + temp.value + "] -> ");
                 temp = temp.next;
             }
             System.out.println("null");
         }
     }
 }
}

//Driver class
public class DesignHashmap {
 public static void main(String[] args) {
     MyHashMap<String, Integer> map = new MyHashMap<>();

     // Inserting key-value pairs
     map.put("Alice", 25);
     map.put("Bob", 30);
     map.put("Charlie", 35);
     map.put("David", 40);
     map.put("Alice", 26); // Updating existing key

     // Displaying HashMap
     System.out.println("Initial HashMap:");
     map.display();

     // Retrieving values
     System.out.println("\nValue for key 'Bob': " + map.get("Bob"));
     System.out.println("Value for key 'Eve': " + map.get("Eve")); // Not present

     // Removing a key
     map.remove("Charlie");
     System.out.println("\nAfter removing 'Charlie':");
     map.display();

     // Checking containsKey
     System.out.println("\nContains key 'Alice'? " + map.containsKey("Alice"));
     System.out.println("Contains key 'Charlie'? " + map.containsKey("Charlie"));

     // Printing size
     System.out.println("\nSize of HashMap: " + map.size());
 }
}
