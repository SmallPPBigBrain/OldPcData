package com.freestyle;

public class ordered_nonSubsequent_substring {
    public static void main(String[] args) {
        solver("abcd",0,"");
    }

    public static void solver(String s, int index,String str){

        if(index == s.length()){

            System.out.println(str);
            return;

        }

        solver(s, index + 1, str + s.charAt(index));
        solver(s, index + 1, str);


    }
}
