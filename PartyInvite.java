package com.freestyle;

public class PartyInvite {
    public static void main(String[] args) {
        System.out.println(Invitations(4));
    }

    public static int Invitations (int n){

        if(n <= 1){

            return 1;

        }

        return Invitations(n - 1) + (n - 1) *Invitations(n - 2);

    }

}
