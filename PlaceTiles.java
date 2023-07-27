package com.freestyle;

public class PlaceTiles {
    public static void main(String[] args) {
        System.out.println(TilePlacer(5,2));
    }

    public static int TilePlacer(double length, double width){

        if(length / width == 1.0){

            return 2;

        }
        else if (length / width < 1.0) {

            return 1;

        }

        return TilePlacer(length - 1, width) + TilePlacer(length - width, width);

    }
}
