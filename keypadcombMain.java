package com.company;

public class keypadcombMain {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printcomb(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.print( combination );
            return;
        }

        char curr = str.charAt(idx);
        String mapping = keypad[curr - '0'];

        for(int i = 0 ; i < mapping.length(); i++){
            printcomb(str, idx+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
	// write your code here
        String str = "41";
        printcomb(str, 0, " ");
    }
}
