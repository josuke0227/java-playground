package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(4);
//        int[] anotherArray = new int[]{1, 20, 30, 4};
        array.insert(1);
        array.insert(2);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(4);
        array.insert(5);
//        array.removeDuplicates();
        array.removeElement(4);
        array.print();
    }
}
