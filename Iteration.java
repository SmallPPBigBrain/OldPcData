package com.freestyle;

public class Iteration {

    public static void main(String[] args) {

        factorial(6);
        System.out.println();
        print_fibonacci(7);

    }

    public static int factorial(int n){
        int factorial;

        if(n == 0)
            return 1;

        factorial = n * factorial(n-1);

        System.out.println(factorial);
        return factorial;
    }

    public static int fibonacci(int n){

        int fibonacci;
        if(n==1) {
            return 0;
        }
        if(n==2) {
            return 1;
        }

        fibonacci = fibonacci (n-2) + fibonacci(n-1);

        return fibonacci;


    }

    public static void print_fibonacci(int n){

        if (n == 0)
            return;
        System.out.print(fibonacci(n) + " ");
        n--;
        print_fibonacci(n);

    }
}
