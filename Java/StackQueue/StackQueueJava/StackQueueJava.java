package StackQueue.StackQueueJava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StackQueueJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> myStack = new Stack<>();

        for (int i =0; i < n; i++){
            myStack.push(sc.nextInt());
        }

        for (Integer integer : myStack){
            System.out.println(integer);
        }
        System.out.println("============== pop 1 element ==============");
        System.out.println("pop ra phan tu "+ myStack.pop());
        for (Integer integer : myStack){
            System.out.println(integer);
        }
        System.out.println("peek hien tai : "+ myStack.peek());

        Queue<Integer> queue = new LinkedList<>();
    }
}
