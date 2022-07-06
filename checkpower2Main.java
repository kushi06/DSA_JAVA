package com.company;

public class checkpower2Main {

    public static boolean ispoweroftwo(int n){
        int count = 0;
        while(n>0){
            if((n & 1)==1){
                count+=1;
            }
            n = n >> 1;
        }
        if(count == 1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
	// write your code here
        if(ispoweroftwo(32)==true){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        if(ispoweroftwo(40)==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
