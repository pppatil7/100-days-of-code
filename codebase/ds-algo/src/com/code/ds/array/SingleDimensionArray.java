package com.code.ds.array;

import javafx.util.Pair;

public class SingleDimensionArray {
    private int array[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        array = new int[sizeOfArray];
        // assign default value
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = Integer.MIN_VALUE;
        }
    }

    public Pair<Boolean, Integer> insert(int index, int valueToInsert) {
        try {
            if (array[index] == Integer.MIN_VALUE) {
                array[index] = valueToInsert;
                return new Pair<Boolean, Integer>(true, index);
            } else {
                System.out.println("Value already present on this location");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error while inserting data " + e.getLocalizedMessage());
        }
        return new Pair<>(false, null);
    }

    public Pair<Boolean, Integer> foundElement(int elementValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementValue) {
                return new Pair<>(true, i);
            }
        }
        return new Pair<>(false, null);
    }

    public void deleteValue(int indexOfValueToDelete) {

        if (indexOfValueToDelete < array.length) {
            array[indexOfValueToDelete] = Integer.MIN_VALUE;
        }
        else{
            System.out.println("Index not in range");
        }

    }


    public void printArray() {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

}
