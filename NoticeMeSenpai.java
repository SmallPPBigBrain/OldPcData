package com.freestyle;
import java.util.*;
class NoticeMeSenpai {

    static void SenpaiNotices() {

        System.out.println("Noticing Me!");

    }

    static void SenpaiBangs() {

        System.out.println("LustySatan");

    }

    static void SenpaiIgnores() {

        System.out.println("Not Interested");

    }

    public static void main(String[] args) {
        Scanner HarderSenpai = new Scanner(System.in);

        System.out.println("Enter 1 to Notice me Senpai! \nEnter 2 to See Underneath Senpai! \nDon't Enter 3 Senpai: ");

        int SenpaisChoice = HarderSenpai.nextInt();
        while (SenpaisChoice < 0 && SenpaisChoice > 4) {

            System.out.println("That's the Wrong Hole Senpai!");
            System.out.println("Enter Again!");
            SenpaisChoice = HarderSenpai.nextInt();

        }

        switch (SenpaisChoice) {

            case 1: {
                System.out.println("Nice Choice Senpai!");
                System.out.print("Senpai is ");
                SenpaiNotices();
                break;
            }

            case 2: {
                System.out.println("oh! Senpai, Why would you do this?");
                System.out.print("Senpai is ");
                SenpaiBangs();
                System.out.println("I Like it Harder Senpai!");
                break;
            }

            case 3: {
                System.out.println("Why won't you notice me Senpai! /n  *Proceeds to Fall on Senpai with her Heavy 80085 *");
                System.out.print("Senpai is ");
                SenpaiIgnores();
                break;
            }
        }
    }
}

