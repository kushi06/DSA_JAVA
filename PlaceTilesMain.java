package com.company;

public class PlaceTilesMain {

    public static int placetile(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //place vertically
        int verticalplacements = placetile(n-m, m);

        //place horizontally
        int horizontalplacements = placetile(n-1, m);

        return (verticalplacements + horizontalplacements);

    }

    public static void main(String[] args) {
	// write your code here
        int n = 5;
        int m = 3;
        int Total = placetile(n, m);
        System.out.println(Total);
    }
}
