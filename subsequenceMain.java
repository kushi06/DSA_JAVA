package com.company;

public class subsequenceMain {

    public static void subsequence( String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(idx);
        subsequence(str, idx+1, newString+curr);  //character is added
        subsequence(str, idx+1, newString);   //character is not added
    }

    public static void main(String[] args) {
	// write your code here
        String str = "abc";
        subsequence(str, 0, " ");
    }
}
