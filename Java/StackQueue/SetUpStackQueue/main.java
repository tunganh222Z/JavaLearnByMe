package StackQueue.SetUpStackQueue;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("=========" +"Stack" + "=========");
        MyArrayStack myStack = new MyArrayStack(n);

        for (int i = 0; i < n; i++){
            myStack.push(sc.nextInt());
        }

        myStack.print();

        System.out.println("===== Pop 1 element ======");
        myStack.pop();
        myStack.print();

        System.out.println("=========" +"Queue" + "=========");
        MyQueueArray queueArray = new MyQueueArray(n);
        for (int i = 0; i < n; i++){
            queueArray.push(sc.nextInt());
        }
        queueArray.print();

        System.out.println("==== pop 1 element ====");
        queueArray.pop();
        queueArray.print();

        System.out.println("=========" +"Linked list stack" + "=========");
        MyLinkedListStack linkedStack = new MyLinkedListStack();

        for (int i = 0; i < n; i++){
            linkedStack.push(sc.nextInt());
        }

        linkedStack.print();

        System.out.println("==== pop 1 element ====");
        linkedStack.pop();
        linkedStack.print();

        System.out.println("=========" +"Linked list queue" + "=========");
        MyLinkedListQueue linkedQueue = new MyLinkedListQueue();
        for (int i = 0; i < n; i++){
            linkedQueue.push(sc.nextInt());
        }

        linkedQueue.print();

        System.out.println("==== pop 1 element ====");
        linkedQueue.pop();
        linkedQueue.print();
        linkedQueue.push(5);
        linkedQueue.print();

    }
}
