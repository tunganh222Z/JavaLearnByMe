package StackQueue.SetUpStackQueue;

public class MyLinkedListQueue implements IStackQueue{
    private class Node{
        private int val;
        private Node next;
        Node(int val){
            this.val = val;
        }
    }

    Node tail;
    Node head;

    MyLinkedListQueue() {
        tail = null;
        head = null;
    }

    @Override
    public boolean push(int value) {
        Node newNode = new Node(value);
        if (!isFull()){
            if (isEmpty()){
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int pop() {
        int value = -1;
        if (isEmpty()){
            return -1;
        } else {
            value = head.val;

            if (head == tail){
                head = tail = null;
            } else {
                head = head.next;
            }
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return head == null && tail == null;
    }

    @Override
    public void print() {
        if (isEmpty()){
            System.out.println("Linked list is empty");
            return;
        }
        Node curNode = head;
        while (curNode != null){
            System.out.print(curNode.val + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }


}
