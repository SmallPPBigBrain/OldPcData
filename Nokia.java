package com.freestyle;

public class Nokia {
    public static void main(String[] args) {
        printStuff(new String[]{"abc", "efg", "hij", "klm", "nop", "qrs", "tuv", "wxy", "z.,", " "}, 0, "123", 0, "", 0);
    }

    public static void printStuff(String [] Str, int Index, String str, int index, String seq, int a){

        if(index == str.length() && a == Str[Index].length() && Index == 0){

            System.out.println("Code has reached the Final Boss");
            System.out.println(seq);
            return;

        }

        if(index == str.length() && a == Str[Index].length()){

            System.out.println("Code has reached the Second Boss");
            System.out.println(seq);
            seq = seq.substring(0,seq.length() - 2);
            printStuff(Str, Index - 2, str, index - 2, seq, 0);
            return;
        }

        if(index == str.length() && ! (a == Str[Index].length())){

            System.out.println("Code has reached the First Boss");
            System.out.println(seq);
            System.out.println("value of Index: " + Index + " \n Value of index: " + (index) + "\n + Value of a: " + (a) );

            if(!(a==str.length() - 1)){seq = seq.substring(0,seq.length() - 1);
                printStuff(Str, Index, str, index - 1, seq, a+1);
                return;

            }
            else{
                seq = seq.substring(0,seq.length() - 2);
                System.out.println(seq + " can you read this");
                printStuff(Str,Index, str, index, seq, a+1);

            }

        }

        System.out.println("The code has somehow reached here");
        Index = ((int) str.charAt(index)) - 49;
        seq =seq+ Str[Index].charAt(a);
        printStuff(Str,Index + 1, str, index + 1, seq, a);



    }
}
