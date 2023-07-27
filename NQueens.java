package com.freestyle;

public class NQueens {

    //the Program has some problems, it solves up to 2 or 3 solutions correctly rest probably are wrong or are repeated so need tos check

    public static boolean [] [] board = new boolean[8][8];
    public static int count;

    public static void main(String[] args) {

        PlaceQueen(0, 0, true);

    }

    public static boolean CheckRow(int row){

        boolean hasQueen = false;

        for (int i = 0; i <= 7; i++) {

            if(board [i] [row]){

                hasQueen = true;
                break;

            }

        }

        return hasQueen;

    }

    public static boolean CheckColumn(int column){

        boolean hasQueen = false;

        for (int i = 0; i <= 7 ; i++) {


            if(board [column] [i] ){

                hasQueen = true;
                break;

            }

        }

        return hasQueen;

    }

    public static boolean CheckDiagonalLeftToRight(int column, int row){

        int c;
        boolean hasQueen = false;
        
        if(row >= column){
            
            c = row - column;
            
            for (int i = 0,j = c; j <= 7; i++, j++) {

                if (board[i][j]) {

                    hasQueen = true;

                    break;
                }
                
            }
            
        }
        
        else {
            
            c = column - row;

            for (int i = 0, j = c; j <= 7; i++, j++) {

                if (board[j][i]) {

                    hasQueen = true;

                    break;
                }
                
            }
            
        }

        return hasQueen;
    
    }

    public static boolean CheckDiagonalRightToLeft(int column, int row){

        int sum = row + column;
        boolean hasQueen = false;
        
        if(sum <= 7){

            for (int i = sum , j = 0; j <= sum; i--, j++) {

                if(board [j] [i] ){

                    hasQueen = true;

                }

            }
            
        }

        else{

            for (int i = sum - 7, j = 7; i <= 7; i++, j--) {

                if(board [i][j]){

                    hasQueen = true;

                }

            }

        }
        
        return hasQueen;

    }

    public static void PlaceQueen(int column, int row, boolean checker){

        if(row == 8 && checker){

            count ++;
            PrintBoard();

            if(count == 12){

                return;

            }

            PlaceQueen(7, 7, false);

        }

        if(column == 8 && CheckRow(row)){

            PlaceQueen(0, row + 1, true);
            return;

        }

        else if(column == 8 && !CheckRow(row)){

            PlaceQueen(7, row - 1, false);
            return;

        }

        if(!board [column] [row] && !checker){

            PlaceQueen(column - 1, row, false);
            return;

        }

        else if(board [column] [row] && !checker){

            board [column] [row] = false;
            PlaceQueen(column + 1, row, true);
            return;

        }

        if(!CheckRow(row) && !CheckColumn(column) && !CheckDiagonalLeftToRight(column, row) && !CheckDiagonalRightToLeft(column, row) && checker){

            board [column] [row] = true;
            PlaceQueen(column + 1, row, true);
            return;

        }

        else{

            PlaceQueen(column + 1, row, true);

        }

    }

    public static void PrintBoard (){

        System.out.println(count+ ":");

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                if(board [j] [i] ){

                    System.out.print("Q ");

                }

                else {

                    System.out.print("_ ");

                }

            }

            System.out.println("");

        }
        System.out.println("\n\n");
    }

}
