package com.freestyle;

import java.util.*;

public class ImABarbieGirlInABarbieWorld {

    public static void main(String[] args) {

        Scanner yo = new Scanner(System.in);
        String[][] Sudoku = new String[9][9];
        String temp_string;

        //inputs the sudoku puzzle
        System.out.println("Enter the Sudoku Fam");
        for (int i = 0; i < 9; i++) {

            temp_string = yo.next();

            for (int j = 0; j < 9; j++) {

                Sudoku[i][j] = String.valueOf(temp_string.charAt(j));

            }

        }

        //shows the unsolved sudoku puzzle with empty fields as 0
        System.out.println("Here's your Sudoku, Blud");
        int count = 0, alt_count = 0;

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                System.out.print(Sudoku[i][j] + " ");

                count++;

                if (count % 3 == 0)
                    System.out.print("\t");

            }
            count = 0;
            System.out.println();

            ++alt_count;
            if (alt_count % 3 == 0)
                System.out.println();
        }

        ImABarbieGirlInABarbieWorld object = new ImABarbieGirlInABarbieWorld();
        int [] [] unique_elements_array_1 = object.Solver(Sudoku);

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                System.out.println("Unique elements for element with row number: " + (i+1) + "and column number: " + (j+1) + " are: " + unique_elements_array_1[i] [j] );

            }
        }
    }

    public int [] []  Solver(String[][] bruh) {

        int row_elements = 0;
        int column_elements = 0;
        int elements_in_square = 0;
        int lower_limit_row = 0;
        int upper_limit_row;
        int lower_limit_column = 0;
        int upper_limit_column;
        int [] [] unique_elements_array = new int[9][9];

        Set<String> unique_elements = new HashSet<>();

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                if (bruh[i][j].equals("0")) {
                    for (int row_iterator = 0; row_iterator < 9; row_iterator++) {

                        if(!( bruh [i] [row_iterator].equals("0") )){

                            unique_elements.add(bruh[i] [row_iterator]);

                        }

                    }

                    for (int column_iterator = 0; column_iterator < 9; column_iterator++) {

                        if(!( bruh [column_iterator] [j].equals("0") )){

                            unique_elements.add(bruh[column_iterator] [j]);

                        }

                    }

                    lower_limit_row = (i / 3);
                    lower_limit_row = lower_limit_row * 3;
                    upper_limit_row = lower_limit_row + 3;

                    lower_limit_column = (j / 3);
                    lower_limit_column = lower_limit_column * 3;
                    upper_limit_column = lower_limit_column + 3;

                    for (int k = lower_limit_row; k < upper_limit_row; k++) {

                        for (int l = lower_limit_column; l < upper_limit_column; l++) {

                            if(!( bruh [k] [l].equals("0") )){

                                unique_elements.add(bruh[k] [l]);

                            }

                        }

                    }

                    System.out.println(unique_elements);
                    unique_elements_array[i][j] = unique_elements.size();
                    unique_elements.clear();

                }

            }

        }

        return unique_elements_array;
    }

    public int Square_returner (int i,int j){

        int sq_no = 0;

        if(i<3){

            if(j<3)
                sq_no = 1;
            else if (j<6)
                sq_no = 2;
            else if(j<9)
                sq_no = 3;

        }

        else if(i<6){

            if(j<3)
                sq_no = 4;
            else if (j<6)
                sq_no = 5;
            else if(j<9)
                sq_no = 6;

        }

        else if(i<9){

            if(j<3)
                sq_no = 7;
            else if (j<6)
                sq_no = 8;
            else if(j<9)
                sq_no = 9;

        }
        
        return sq_no;
        
    }
    
    public int limit_returner_row(int sq_no){
        
        int smth=0;
        if (sq_no == 1 || sq_no == 2 || sq_no == 3)
            smth = 3;

        if (sq_no == 4 || sq_no == 5 || sq_no == 6)
            smth = 6;

        if (sq_no == 7 || sq_no == 8 || sq_no == 9)
            smth = 9;

        return smth;
    }
}
