package com.company;

import java.util.ArrayList;

public class subsetofsetMain {

    public static void findsub(int n, ArrayList<Integer> subset){
        if(n == 0){
            printsub(subset);
            return;

        }
        //add hoga
        subset.add(n);
        findsub(n-1, subset);

        //add nahi hoga
        subset.remove(subset.size()-1);         //element would be added in the last
        findsub(n-1, subset);
    }

    public static void printsub(ArrayList<Integer> subset) {
        for (int i = 0 ; i < subset.size(); i++){
            System.out.print(subset.get(i) +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findsub(n, subset);

    }
}
