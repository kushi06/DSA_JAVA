package com.company;

public class TotalpathinMazeMain {
    public static int countPath(int i, int j, int n, int m){
        if(i == n || j == m){      //out of boundary
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;               //reached destination
        }


        //move downward
        int downpath = countPath(i+1, j , n , m);

        //move right
        int right = countPath(i, j+1, n, m);

        return (downpath+right);
    }

    public static void main(String[] args) {
	// write your code here
        int n = 4;
        int m = 4;
        int Totalpath = countPath(0, 0, n , m);
        System.out.println(Totalpath);

    }
}
