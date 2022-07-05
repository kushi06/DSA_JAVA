package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 5;
        int pos = 2;
        int bitmasking = 1<<pos;
        if((bitmasking & n) == 0){
            System.out.println("Bit was zero");
        }else{
            System.out.println("Bit was one ");
        }

    }
}
