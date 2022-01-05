package com.company;

public class Playground {
    private int[] items;
    private int count;

    public Playground(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (count == items.length){
            int[] newArray = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newArray[i] = items[i];
            }

            items = newArray;
        }

        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index > count)
            throw new IllegalArgumentException();

        for (int i = index; i < count -1; i++)
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf (int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
