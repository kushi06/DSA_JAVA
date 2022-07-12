package com.company;

public class StringRevMain {
    public static void print_rev(String str , int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        print_rev(str, idx-1);
    }

    public static void main(String[] args) {
	// write your code here
        String str = "klmn";
        print_rev(str, str.length()-1);
    }
}
