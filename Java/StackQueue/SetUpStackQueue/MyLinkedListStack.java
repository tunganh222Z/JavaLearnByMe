package StackQueue.SetUpStackQueue;

public class MyLinkedListStack implements IStackQueue{
    private class Node {
        int val;
        Node next;
        Node (int val){
            this.val = val;
        }

        Node(int val, Node nextNode){
            this.val = val;
            this.next = nextNode;
        }
    }

    Node topNode;

    MyLinkedListStack(){
        topNode = null;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()){
            Node newNode = new Node(value);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (isEmpty()){
            return -1;
        }
            int value = topNode.val;
        topNode = topNode.next;
        return value;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void print() {
        Node curNode = topNode;
        if (isEmpty()){
            System.out.println("Linked list empty");
            return;
        }
        while (curNode != null){
            System.out.println(curNode.val + " ");
            curNode = curNode.next;
        }
    }
}
