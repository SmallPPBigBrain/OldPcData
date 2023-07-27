package com.freestyle;

import java.util.Arrays;
import java.util.zip.CheckedInputStream;

public class print_string_reverse {

    static int i = 0;
    static boolean is_unsorted = false;

    public static void main(String[] args) {
        check_if_array_is_strictly_increasing(new int[]{1, 4, 5, 9});
        if (!is_unsorted)
            System.out.println("Sorted in required manner");
        boolean [] true_or_false = new boolean[26];
        Arrays.fill(true_or_false,false);
        Remove_Duplicates("AaAAbbBBccddeeffgghhjjkkllmmnnoooppqqrrssttuuvvwwwxxyyzzzz",0,true_or_false,"");
    }

    //Maybe use another version of this function which uses an index variable too so
    //That the string does not create itself over and over in a stack cuz strings are
    //immutable. umm...not that i think about it, maybe not
    public static void print_reverse (String s){
        if(s.length() == 1){

            System.out.println(s);
            return;

        }

        System.out.print(s.charAt(s.length() - 1) + " ");
        print_reverse(s.substring(0,s.length() - 1));

    }

    public static void check_if_array_is_strictly_increasing(int [] array){

        if(array[i] >= array[i+1]){
            System.out.println("Unsorted in required manner.");
            is_unsorted = true;
        }
        else{
            i++;
            if(i == array.length - 2)
                return;
            check_if_array_is_strictly_increasing(array);
        }
    }

    public static void Remove_Duplicates(String s, int a,boolean [] checker,String str){
        if(a == s.length()){
            System.out.println(str);
        }
        else {
            if (Character.isUpperCase(s.charAt(a))) {
                //or instead you can use this inside if: ((checker[s.charAt(a) - a] because a - a = 0 and b - a = 1 (when using in terms of integers)
                if (checker[((int) s.charAt(a)) - 65]) {
                    Remove_Duplicates(s, a + 1, checker, str);
                } else {
                    str += s.charAt(a);
                    checker[((int) s.charAt(a)) - 65] = true;
                    Remove_Duplicates(s,a+1, checker, str);
                }

            }
            if (Character.isLowerCase(s.charAt(a))) {

                if (checker[((int) s.charAt(a)) - 97]) {
                    Remove_Duplicates(s, a + 1, checker, str);
                } else {
                    str += s.charAt(a);
                    checker[((int) s.charAt(a)) - 97] = true;
                    Remove_Duplicates(s,a+1, checker, str);
                }
            }
        }
    }
}

