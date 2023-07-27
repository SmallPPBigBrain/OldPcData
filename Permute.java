package com.freestyle;

public class Permute {

    public static void main(String[] args) {

        System.out.println("My code: ");
        Permutations("abcd", "", 4);
        System.out.println("\nNow here we have Ma'am's code: ");
        PrintPermutations("abcd", "", 0);

    }

    //My Code:
    public static void Permutations(String s, String str, int length){

        if(str.length() == length){

            System.out.println(str);
            return;

        }

        for (int i = 0; i < s.length(); i++) {

            Permutations(s.substring(0,i) + s.substring(i+1), str + s.charAt(i), length);

        }

    }

    //both my code and Ma'am's code have a similar approach except for the fact that she is using
    //the length of the initial string (here str) as a counter, so as soon as the length of the initial string when
    //passed by recursion becomes 0, the program prints the permutation (here perm) and returns to previous call
    //Meanwhile, in my program, I am using the length of the permutation as a counter, so as soon as the
    //permutation (here str), becomes the size of the initial string, I print the permutation (str) and
    //return back to the previous call

    //Ma'am Code:
    public static void PrintPermutations(String str, String perm, int index){

        if(str.length() == 0){

            System.out.println(perm);
            return;

        }

        for (int i = 0; i < str.length(); i++) {

            PrintPermutations(str.substring(0,i) + str.substring(i+1), perm + str.charAt(i), index + 1);

        }

    }
}
