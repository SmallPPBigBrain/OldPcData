package com.freestyle;

public class AllPermutations {
    public static void main(String[] args) {
        permute("abc", "");
    }

    public static void permute(String str, String permutation) {

        if(str.length() == 0){

            System.out.println(permutation);
            return;

        }

        //To iterate through every possible letter other than the ones that are already stored in the permutation
        //The loop iterates specifically till length of string to avoid StringOutOfBoundsException
        for (int i = 0; i < str.length(); i++) {

            //To add into the permutation
            char currChar = str.charAt(i);

            //'nStr' is used in place of permutation here because we still want to add one by one in permutation
            //Simply using permutation here would not allow for non-subsequent characters to be added into permutation
            //here we are intentionally excluding the curr character so to not pass nStr while it has the curr character
            String nStr = str.substring(0,i) + str.substring(i+1);

            //Recalling the function but passing nStr as str because nStr is supposed to contain letter other than
            //The ones that are already contained in the permutation
            //We add current character with permutation here because we don't want to add it initially because that would
            //mess up the program
            permute(nStr, permutation + currChar);

        }

    }
}
