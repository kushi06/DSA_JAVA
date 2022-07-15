package com.company;

public class callingguestMain {

    public static int callingguest(int n){
        if(n <= 1){
            return 1;
        }
        //single
        int ways1 = callingguest(n-1);

        //pairs
        int ways2 = (n-1)*callingguest(n-2);

        return ways1+ways2;
    }

    public static void main(String[] args) {
	// write your code here
        int n = 4;
        int totalways = callingguest(n);
        System.out.println(totalways);
    }
}
