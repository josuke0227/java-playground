package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        resizeIfNecessary();
        items[count++] = item;
    }

    public void removeAt(int index){
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count - 1; i++)
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }

    public int max() {
        int max = 0;

        for (int item : items)
            if (max < item) max = item;

        return max;
    }

    public Array intersect(Array anotherItems ){
        Array intersection = new Array(count);

        for (int item : items)
            if (anotherItems.indexOf(item) >= 0)
                intersection.insert(item);

        return intersection;
    }

    public void reverse() {
        int[] newItems = new int[count];

        for (int i = 0; i < count; i++)
            newItems[count -1 - i] = items[i];

        items = newItems;
    }

    public void insertAt (int item, int index){
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        resizeIfNecessary();

        for (int i = count - 1; i >= index; i--){
            items[i + 1] = items[i];
        }

        items[index] = item;
        count++;
    }

    private void resizeIfNecessary() {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
    }

    public int[] twoSum(int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < count; i++) {
            int complement = target - items[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(items[i], i);
        }

        return null;
    }

    public void removeElement(int val) {
        int i = 0;

        for (int j = 0; j < items.length; j++) {
            if (items[j] != val) {
                items[i] = items[j];
                i++;
            } else {
                count--;
            }
        }
    }

    public void removeDuplicates() {
//        Works only for sorted array
        if (count == 0) return;

        int i = 0;
        for (int j = 1; j < items.length; j++) {
            if (items[j] != items[i]) {
                items[++i] = items[j];
            } else {
                count--;
            }
        }
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
