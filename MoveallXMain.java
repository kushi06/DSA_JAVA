package com.company;

public class MoveallXMain {

    public static void MoveallX(String str, int idx, int count, String newString){
        if(idx == str.length()){
            for(int i = 0; i < count ; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(idx);
        if(curr == 'x'){
            count++;
            MoveallX(str,idx+1,count,newString);
        }
        else{
            newString += curr;
            MoveallX(str, idx+1, count, newString);
        }
    }

    public static void main(String[] args) {
	// write your code here
        String str = "axbcxxd";
        MoveallX(str, 0, 0, " ");
    }
}
