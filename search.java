package com.freestyle;

public class search extends sort{

    public int search_linear(int[] array, int search_element){

        search ob = new search();

        ob.sort_bubble(array);

        int i;
        boolean decider = false;

        for (i = 0; i < array.length; i++) {

            if(array[i] == search_element){
                decider = true;
                break;
            }

        }

        if(decider == false)
            return -1;
        else
            return i;

    }


    public int search_binary(int[] array, int search_element){

        search ob = new search();

        ob.sort_bubble(array);

        int lower_limit = 0;
        int upper_limit = array.length - 1;
        int mid = (lower_limit + upper_limit) / 2;;
        boolean decider = false;

        while(lower_limit <= upper_limit ){

            if(search_element < array[mid])
                upper_limit = mid - 1;

            else if(search_element > array[mid])
                lower_limit = mid + 1;

            if(search_element == array[mid]){
                decider = true;
                break;
            }

            mid = (lower_limit + upper_limit) / 2;
        }

        if(decider == true)
            return mid;
        else
            return -1;

    }
}
