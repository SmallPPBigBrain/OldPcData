package com.freestyle;

import java.util.HashSet;

public class SubstringsOfSameCharacters {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        solve("aaaaa", 0, "", set);

    }

    public static void solve(String s, int index, String str, HashSet <String> set){

        if(index == s.length()){

            if(set.contains(str)){

                return;

            }
            else{

                set.add(str);
                System.out.println(str);
                return;

            }

        }

        solve(s, index + 1, str + s.charAt(index), set);
        solve(s, index + 1, str, set);

    }
}
