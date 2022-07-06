package com.company;

public class no_of_1s_binaryMain {
    public static int no_of_1s(int n){
        int count = 0;
        while(n > 0){
            count+=n&1;
            n>>=1;
        }
        return count;
    }

    public static void main(String[] args) {
	// write your code here
        int i  = no_of_1s(7);
        System.out.println(i);
    }
}
