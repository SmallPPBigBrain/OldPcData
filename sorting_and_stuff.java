package com.freestyle;
import java.util.Scanner;

public class sorting_and_stuff {
    
    int [] some_array = new int[9];

    public void input (){

        Scanner yo = new Scanner (System.in);

        for (int i = 0; i < some_array.length; i++) {

            System.out.println("Enter the element No. " + (i+1) + " of the array");
            some_array[i] = yo.nextInt();

        }

    }
    
    public void bubble_sort(){

        int swapper;

        for (int i = 0; i < some_array.length - 1; i++) {

            for (int j = 0; j < some_array.length - 1 - i; j++) {

                if(some_array[j] > some_array[j+1]){

                    swapper = some_array[j];
                    some_array[j] = some_array[j+1];
                    some_array[j+1] = swapper;

                }

            }
            
        }
        
    }

    public void Selection_sort(){

        int lowest_value_index = 0;
        int swapper;

        for (int i = 0; i < some_array.length; i++) {

            for (int j = i; j < some_array.length - 1; j++) {

                if(some_array[j + 1] < some_array[lowest_value_index]){

                    lowest_value_index = j+1;

                }

            }

            swapper = some_array[i];
            some_array[i] = some_array[lowest_value_index];
            some_array[lowest_value_index] = swapper;

        }

    }

    public void display(){

        System.out.println("Here's Your Array, Blud:");
        for (int j : some_array) {

            System.out.println(j + " ");

        }
    }

    public void Insertion_Sort(){

        int swapper = 0;
        int index = 0;
        boolean is_unsorted = false;

        for (int i = 1; i < some_array.length; i++) {

            for (int j = i-1; j >= 0 ; j--) {

                if(some_array[j] > some_array[i]){

                    is_unsorted = true;
                    swapper = some_array[i];
                    index = j;

                }

            }
            System.out.println("This is before the second and third loop: ");
            System.out.println("value of i: " + i);
            System.out.println("value of is_unsorted: " + is_unsorted);
            System.out.println("value of swapper: " + swapper);
            System.out.println("value of index: " + index);

            for (int j: some_array) {

                System.out.print(j+ " ");

            }
            System.out.println();

            if(is_unsorted){

                for (int j = i; j > index ; j--) {

                    some_array[j] = some_array[j - 1];

                }

                some_array[index] = swapper;

            }

            is_unsorted = false;

            System.out.println("This is after the thrid loop: ");
            System.out.println("value of i: " + i);
            System.out.println("value of is_unsorted: " + is_unsorted);
            System.out.println("value of swapper: " + swapper);
            System.out.println("value of index: " + index);

            for (int j: some_array) {
                System.out.print(j+ " ");
            }
            System.out.println("\n + \n" );
        }

    }

    public static void main(String[] args) {

        sorting_and_stuff object = new sorting_and_stuff();

        System.out.println("Enter 1 for Selection Sort");
        System.out.println("Enter 2 for Bubble Sort");
        System.out.println("Enter 3 for Insertion Sort");
        System.out.println("Enter the choice of sorting: ");
        Scanner yo = new Scanner(System.in);
        int choice_of_sort =  yo.nextInt();

        object.input();
        if(choice_of_sort == 1)
            object.Selection_sort();
        else if (choice_of_sort == 2)
            object.bubble_sort();
        else if (choice_of_sort == 3)
            object.Insertion_Sort();

        object.display();

    }
}
