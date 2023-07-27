package com.freestyle;

import java.util.Scanner;

public class new1 {

    public static void main(String[] args) {

        Scanner yo = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = yo.nextInt();


        try {
            System.out.println(num / 0);
        }
        catch (ArithmeticException a){
            System.out.println("Error: " + a);
        }
        System.out.println("This is a very important segment of code it needs to run");

    }
}
