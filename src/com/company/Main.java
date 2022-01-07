package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(4);
        int[] num1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] num2 = new int[]{2, 5, 6};
        array.insert(1);
        array.insert(2);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(4);
        array.insert(5);
//        array.removeDuplicates();
        array.removeElement(4);
        System.out.println(Arrays.toString(array.merge(num1, 3, num2, 3)));
        array.print();
    }
}
