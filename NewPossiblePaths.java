package com.freestyle;

public class NewPossiblePaths {
    public static void main(String[] args) {

        System.out.println(NoOfPathFinder(0,0,2,2));

    }

    //My Code:
    public static int NoOfPathFinder(int XCords, int YCords, int XDest, int YDest){

        if(XCords == XDest && YCords == YDest) {

            return 1;

        }

        else if(XCords == XDest){

            return 1;

        }

        else if (YCords == YDest){

            return 1;

        }

        return NoOfPathFinder( XCords,YCords+1, XDest, YDest ) +NoOfPathFinder(XCords+1, YCords, XDest, YDest );
        
    }
    
}
