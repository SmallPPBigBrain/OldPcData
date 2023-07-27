package com.freestyle;

import java.util.Scanner;

public class test1 extends sort {

    public static void main(String args []){

        Scanner yo = new Scanner(System.in);
         int[] a = new int[10];

        System.out.println("Enter the elements:");
        for (int i = 0; i < 10; i++) {
            a[i] = yo.nextInt();
        }
        test1 ob = new test1();
        ob.sort_bubble(a);

        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
