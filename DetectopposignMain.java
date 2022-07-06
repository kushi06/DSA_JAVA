package com.company;

public class DetectopposignMain {

    public static void main(String[] args) {
	// write your code here
        int x = 4;
        int y = 8;

        if((x ^ y) < 0){
            System.out.println(x +" and "+ y +" have opposite sign");
        }
        else{
            System.out.println(x +" and "+ y +" don't have opposite sign");
        }
    }
}
