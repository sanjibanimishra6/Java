/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
class MyClass {
    int num = 5;
 
    public void changeValue(int num) {
        this.num = num;
    }

 

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.changeValue(10);
        System.out.println(obj.num);
    }
}
