package com.code.ds.array;

import javafx.util.Pair;

public class SingleDimensionMain {

    public static void main(String[] args) {
        SingleDimensionArray array = new SingleDimensionArray(10);
        array.insert(0, 0);
        array.insert(1, 10);
        array.insert(2, 20);

        // print array
        array.printArray();

        System.out.println("\n ==== Found element ====");
        Pair<Boolean, Integer> foundElement = array.foundElement(30);
        System.out.println(foundElement.getKey() + " "+ foundElement.getValue());

    }
}
