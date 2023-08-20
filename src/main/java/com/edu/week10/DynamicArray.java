package com.edu.week10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DynamicArray<T> {
    private Object [] data;  //used to store the element of dynamic array. any object type
    private int size;
    private int capacity;

    public DynamicArray() {
        capacity = 10;
        data = new Object[capacity];
        size = 0;
    }

    public void add(T element){
        if (size == capacity){
            resizeArray();
        }
        data[size] = element;
        System.out.println(Arrays.toString(data));
        size++;
    }


    public int size() {
        return size;
    }
    private void resizeArray() {
        capacity *=2;
        Object[] newData = new Object[capacity];
        //System.arraycopy(data, 0, newData, 0, size);
        data = Arrays.copyOf(data, capacity);
       // data = newData;

    }

    public static void main(String[] args) {
       // ArrayList<Integer> a = new ArrayList<>();
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        for (int i = 0; i < 4; i++) {
            dynamicArray.add(i);
        }
        System.out.println("Size: " + dynamicArray.size());
        DynamicArray<Integer> intArray = new DynamicArray<>();
        intArray.add(10);
        intArray.add(20);
        System.out.println("IntArray_Size: " + intArray.size());

        DynamicArray<String> stringArray = new DynamicArray<>();
        stringArray.add("Hello");
        stringArray.add("World");
        stringArray.add("Kids");
        System.out.println("StringArray_Size: " + stringArray.size());

    }



}
