package com.freestyle;

public class ordered_subsequent_substrings {
    public static void main(String[] args) {
        print("abcd",4);
    }

    public static void print(String s, int substring_length){

        if (substring_length == 0){
            return;
        }
        if(substring_length == s.length()){
            System.out.println(s);
            print(s,--substring_length);
        }
        else{
            for (int i = 0; i+substring_length <= s.length(); i++) {
                System.out.println(s.substring(i,i+substring_length));
            }
            print(s,--substring_length);
        }

    }
}
