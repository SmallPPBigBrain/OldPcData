package com.freestyle;

public class Subsets {
    public static void main(String[] args) {
        Print_idk("1234", 0, "");
    }

    public static void Print_idk(String s, int index, String str){

        if(index == s.length()){

            System.out.println(str);
            return;

        }

        Print_idk(s, index + 1, str + s.charAt(index));
        Print_idk(s, index + 1, str);

    }
}
