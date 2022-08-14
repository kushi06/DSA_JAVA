package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
