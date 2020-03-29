package com.company;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    // Attributes
    private Node<T> top;

    // Methods
    public Stack() {
        this.top = null;
    }

    public void push (T data){
        // We create a new Node with the the new data.
        // We set its next node.
        // We update the base, this is key to always update the base, fundamental part of a stack.
        Node<T> newTop = new Node<>();
        newTop.setData(data);
        newTop.setNext(top);
        top = newTop;
    }

    public T pop (){
        // We get the the data from the top of the stack ( top node)
        // We update the top with its next.
        // We return the data of the old top.
        T data =  top.getData();
        top = top.getNext();
        return data;
    }

    // Method to get the size of the stack.
    public int getSize(){
        int size = 0;
        Node<T> auxBase = top;

        while(auxBase != null){
            size++;
            auxBase = auxBase.getNext();
        }
        return size;
    }

    // It will iterate the stack ( behind the scene linked list),
    // will store all the information in an array list and return it.
    // We use an aux node variable so we dont lose the information of the top node.
    public List<T> getElements () {
        Node<T> auxBase = top;
        ArrayList<T> myArray = new ArrayList<>();

        while(auxBase != null){
            T element = auxBase.getData();
            myArray.add(element);
            auxBase = auxBase.getNext();
        }
        return myArray;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
}
