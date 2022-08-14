package com.company;

import java.util.*;

public class QueueusingTwostack {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void Add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            return s1.pop();
        }

        public static int peek() {
            return s1.peek();
        }

    }
    public static void main(String[] args) {
	// write your code here
        Queue q = new Queue();
        q.Add(1);
        q.Add(2);
        q.Add(3);
        q.Add(4);

        System.out.println(q.remove());
        System.out.println(q.peek());

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
