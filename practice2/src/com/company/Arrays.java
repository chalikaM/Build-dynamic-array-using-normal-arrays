package com.company;

public class Arrays {

    private int[] items;
    private int count = 0;

    public Arrays(int length){
        items = new int[length];
    }

    public void insert(int item){

        items[count] = item;
        count = count + 1;

        if (count == items.length){

            int[] newItems = new int[count * 2];
        }


    }

    public void print(){
        for( int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }






}
