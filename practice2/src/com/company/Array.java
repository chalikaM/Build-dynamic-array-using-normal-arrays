package com.company;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item){
        //Add new item at the end
        items[count] = item;
        count ++;

        //If the array is full it must be resized.
        if (items.length == count){
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
             items = newItems;
        }
    }

    public void remove(int index){
        if (index < 0 || index >= count){
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count; i++){
            items[i] = items[i + 1];
        }
        count --;

    }

    public int search(int item){

        for (int i = 0; i < count; i++){
            if(items[i] == item){
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }
}
