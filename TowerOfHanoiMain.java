package com.company;

public class TowerOfHanoiMain{
    public static void towerofhanoi(int n, String src, String help, String dest){
        if(n==0){
            return;
        }
        towerofhanoi(n-1, src, dest,help);
        System.out.println("Transfering "+ n +" from "+ src + " to " +
                "" + dest );
        towerofhanoi(n-1, help, src, dest);
    }
    public static void main(String[] args) {
	// write your code here
        int n = 3;
        towerofhanoi(n , "S", "H", "D");
    }


}
