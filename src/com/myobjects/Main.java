/**
 *  Java program to create objects with different types.
 */

package com.myobjects;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating a String type object.
        String text = "text";

        // Creating an Object type variable.
        Object textObj = "another text";

        // Creating another String object.
        //String newText = textObj; DOES NOT WORK!
        Object newText1 = text;

        // Printing 3 different texts.
        System.out.println("1: " + text);
        System.out.println("2: " + textObj);
        System.out.println("3: " + newText1);

    }
}