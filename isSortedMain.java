package com.company;

public class isSortedMain {
    public static boolean isSorted(int arr[], int idx){

        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }
        return isSorted(arr, idx+1);
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {1, 3, 9};
        System.out.println(isSorted(arr, 0));
    }
}
