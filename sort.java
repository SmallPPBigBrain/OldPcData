package com.freestyle;

public class sort {

    int[] sort_selection(int array[]){

        int min;
        int length = array.length;
        int x;

        for (int i = 0; i < length - 1; i++) {
            min = i;

            for (int j = i + 1; j < length; j++) {
               if(array[j] < array[min])
                   min = j;
            }

            x = array[i];
            array[i] = array[min];
            array[min] =x;
        }
        return array;
    }

    int[] sort_bubble(int array[]){

        int length = array.length;
        int x;

        for (int i = 0; i < length - 1; i++) {

            for (int j = 0; j < length - i - 1; j++) {

                if (array[j] > array[j + 1]){
                    x = array[j];
                    array[j] = array[j + 1];
                    array[j +1] = x;
                }
            }
        }
        return array;
    }
}
