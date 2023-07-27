package com.freestyle;

import java.util.Scanner;

public class test2 extends search {

    public static void main(String[] args){

        Scanner yo = new Scanner(System.in);
        test2 ob = new test2();

        int[] array = new int[10];

        System.out.println("Enter the elements:");

        for (int i = 0; i < 10; i++){

            array[i] = yo.nextInt();

        }

        System.out.println("Enter the search element: ");
        int search_element = yo.nextInt();
        System.out.println();

        System.out.println("Unsorted Array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(" | " + array[i]);
        }
        System.out.println(" |");
        System.out.println();

        int index = ob.search_binary(array, search_element);

        System.out.println("The Array in Ascending order: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(" | " + array[i]);
        }
        System.out.println(" |");
        System.out.println();

        if(index != -1){
            System.out.println("Search successful");
            System.out.println("Element index: " + index);
        }
        else
            System.out.println("Search unsuccessful");
    }
}
