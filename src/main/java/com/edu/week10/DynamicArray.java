package com.edu.week10;

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
        size++;
    }


    public int size() {
        return size;
    }
    private void resizeArray() {
        capacity *=2;
        Object[] newData = new Object[capacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    public static void main(String[] args) {
       // ArrayList<Integer> a = new ArrayList<>();
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        for (int i = 0; i < 20; i++) {
            dynamicArray.add(i);
            System.out.println("Size: " + dynamicArray.size());
        }

    }



}
