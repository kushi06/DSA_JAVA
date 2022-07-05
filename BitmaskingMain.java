package com.company;

import java.util.Scanner;

public class BitmaskingMain {

     public static void getbit(int n , int pos){
         int bitmasking = 1 << pos;
         if((bitmasking & n) == 0){
             System.out.println("Bit was zero");
         }else{
             System.out.println("Bit was one ");
         }
     }
      public static void setbit (int n , int pos){
         int bitmasking = 1 << pos;
         int new_num = bitmasking | n;
          System.out.println(new_num);
      }
      public static void clearbit (int n, int pos){
         int bitmasiking = 1<< pos;
         int notbit = ~(bitmasiking);
         int newnumber = notbit & n;
          System.out.println(newnumber);
      }
      public static void updatebit (int n, int pos){
          Scanner sc = new Scanner(System.in);
          int oper = sc.nextInt();
          int bitmasking = 1 << pos;
          if(oper == 1){
              int newnumber = bitmasking | n;
              System.out.println(newnumber);
          }
          else{
              int notbit = ~(bitmasking);
              int newnum = notbit & n;
              System.out.println(newnum);
          }
      }

    public static void main(String[] args) {
	// write your code here
        getbit(5, 2);
        setbit(5,2);
        clearbit(5, 2);
        updatebit(5, 2);

    }
}
