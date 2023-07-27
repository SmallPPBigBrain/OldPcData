package com.freestyle;

public class PossiblePaths {
    static int paths;
    public static void main(String[] args) {
        Paths(0,0,2,2);
        System.out.println(paths);
        System.out.println(CountPath(0, 0, 2, 2));
    }

    //My Code:
    public static void Paths(int XCords, int YCords, int XDest, int YDest){

        if(XCords == XDest && YCords == YDest) {

            paths++;
            return;

        }

        else if(XCords == XDest){

            Paths(XCords,YCords+1,XDest,YDest);
            return;

        }

        else if(YCords == YDest){

            Paths(XCords+1, YCords,XDest,YDest);
            return;

        }

        Paths(XCords+1, YCords, XDest, YDest );
        Paths( XCords,YCords+1, XDest, YDest );

    }

    //Apna College code:
    public static int CountPath(int i, int j, int n, int m){

        if(i == n || j == m){

            return 0;

        }

        if(i == n-1 && j == m - 1){

            return 1;

        }

        int downpaths = CountPath(i+1, j, n, m);
        int rightpaths = CountPath(i, j+1, n, m);

        return downpaths + rightpaths;

    }
}
