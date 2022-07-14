package com.company;

import java.util.HashSet;

public class uniquesubsequenceMain {
    public static void uniquesubsequence(String str , int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char curr = str.charAt(idx);
        //character to be added
        uniquesubsequence(str, idx+1, newString+curr, set);

        //character not to be added
        uniquesubsequence(str, idx+1, newString, set);
    }

    public static void main(String[] args) {
	// write your code here
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniquesubsequence(str, 0, " ", set);
    }
}
