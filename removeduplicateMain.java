package com.company;

public class removeduplicateMain {
    public static boolean[] map = new boolean[26];

    public static void removeduplicate(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char curr = str.charAt(idx);
        if(map[curr - 'a']){
            removeduplicate(str, idx+1, newString);
        }
        else{
            newString += curr;
            map[curr - 'a'] = true;
            removeduplicate(str, idx+1, newString);
        }
    }

    public static void main(String[] args) {
	// write your code here
        String str = "aabbccd";
        removeduplicate(str, 0, " ");
    }
}
