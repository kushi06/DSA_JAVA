package com.company;

import java.util.Scanner;

public class toggleposMain {
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;

        int bitmask = 1<<pos;

        if(oper == 1){
            int newnum = bitmask | n;
            System.out.println(newnum);
        }
        else{
            int newnumber = ~(bitmask);
            int x = newnumber & n;
            System.out.println(x);
        }


    }
}
