package com.company;

import java.util.List;
import java.util.ArrayList;

public class GenericArray<T extends Comparable> { // This means that the class will accept any object that implements the Comparable inteface.
    // Attributes
    private List<T> myArray;

    // Constructor

    public GenericArray() {
        this.myArray = new ArrayList<T>();
    }

    public GenericArray(List<T> myArray) {
        this.myArray = myArray;
    }

    // Getters and setters

    public List<T> getMyArray() {
        return myArray;
    }

    public void setMyArray(List<T> myArray) {
        this.myArray = myArray;
    }

    // Methods
    public boolean existsItem(T searchedObject){
        boolean condition = false;

        if(!myArray.isEmpty()){
            for (T element: myArray) {
                // using compareTo method from comparable inteface. ( if they are equal it returns 0)
                if(element.compareTo(searchedObject) == 0){
                    condition= true;
                }
            }
        }
        return condition;
    }

    public T getMaxValue(){
        T max = myArray.get(0);

        if(!myArray.isEmpty()){
            for (T element: myArray) {
                // using compareTo method from comparable inteface.
                // (if element is bigger than the supposed max, returns a number bigger than 0)
                if(element.compareTo(max) > 0){
                    max = element;
                }
            }
        }
        return max;
    }

    public T getMinValue(){
        T min = myArray.get(0);

        if(!myArray.isEmpty()){
            for (T element: myArray) {
                if(element.compareTo(min) < 0){
                    min = element;
                }
            }
        }
        return min;
    }

    public T removeLastOne(){
        T lastOne = null;

        if(!myArray.isEmpty()){
            lastOne = myArray.get(myArray.size() - 1);
            myArray.remove(lastOne);
        }
        return lastOne;
    }

    public void add(T object){
        myArray.add(object);
    }

    // Redefine to string
    @Override
    public String toString() {
        return "GenericArray{" +
                "myArray=" + myArray +
                '}';
    }
}
