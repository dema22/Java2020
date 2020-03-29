package com.company;

public class Main {

    public static void main(String[] args) {
        // Create an array with our generic array class
        GenericArray<Integer> myArray = new GenericArray<>();

        // Adding elements
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(30);
        myArray.add(4);
        myArray.add(60);

        // Testing if the array has been created and if we can add elements to it
        System.out.println(myArray);

        // Checking the existItem method
        System.out.println("The 2 number exists in the array : " + myArray.existsItem(2));
        System.out.println("The 20 number exists does not exists the array : " + myArray.existsItem(20));

        // Checking the getMaxValue method
        System.out.println("The biggest element of the array is : " + myArray.getMaxValue());

        // Checking the getMinValue method
        System.out.println("The smallest element of the array is : " + myArray.getMinValue());

        // Checking the removeLastOne method and then we print all the array again.
        System.out.println("The last element of the array that we removed is : " + myArray.removeLastOne());
        System.out.println(myArray);

        // Creating a stack of integers, the stack is implemented with a single linked list behind the scenes.
        Stack<Integer> myStack = new Stack<>();
        myStack.push(20);
        myStack.push(200);
        myStack.push(500);

        // Printing the stack
        System.out.println("\n STACK ELEMENTS: \n");
        for (Integer element: myStack.getElements()) {
            System.out.println(element);
        }

        System.out.println("\nWe remove the base of the stack (500)");
        System.out.println(myStack.pop());

        System.out.println("\n STACK ELEMENTS: \n");
        for (Integer element: myStack.getElements()) {
            System.out.println(element);
        }

        System.out.println("\n SIZE OF THE STACK: ");
        System.out.println(myStack.getSize());
    }
}
