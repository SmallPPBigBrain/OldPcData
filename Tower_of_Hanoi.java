package com.freestyle;

public class Tower_of_Hanoi {
    public static void main(String[] args) {
        int n=8;
        tower_of_hanoi(n,"S","H","D");
    }

    public static void tower_of_hanoi (int n, String src, String helper, String dest){
        if(n==1){
            System.out.println ("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        tower_of_hanoi(n-1, src, dest, helper);
        System.out.println ("transfer disk " + n + " from " + src + " to " + dest);
        tower_of_hanoi(n-1, helper, src, dest);
    }
}
