package StackQueue;

public class _707_DesignLinkedList {
    public static void main(String[] args) {

    }


    class MyLinkedList {
        int val;
        MyLinkedList next;

        private MyLinkedList head;
        private int size;

        public MyLinkedList(int val, MyLinkedList next){
            this.val = val;
            this.next = next;
        }

        public MyLinkedList(int val){
            this.val = val;
        }

        public MyLinkedList() { // init new linked List
            head = null;
            size = 0;
        }

        public int get(int index) {
            if (head == null || index < 0 || index >= size){
                return -1;
            }

            MyLinkedList curNode = head;

            for (int i = 0; i < index; i++){
                curNode = curNode.next;
            }

            return curNode.val;
        }

        public void addAtHead(int val) {
            MyLinkedList newHead = new MyLinkedList(val);

            if (head == null){
                head = newHead;
            } else {
                newHead.next = head;
                head = newHead;
            }
            size++;
        }

        public void addAtTail(int val) {
            MyLinkedList newTail = new MyLinkedList(val);
            if (head == null) {
                head = newTail;
            } else {
                MyLinkedList curNode = head;
                while (curNode.next != null) {
                    curNode = curNode.next;
                }
                curNode.next = newTail;
            }
            size++;
        }


        public void addAtIndex(int index, int val) {
            if (index > size) return;
            if (index == 0) {
                addAtHead(val);
                return;
            }

            MyLinkedList newNode = new MyLinkedList(val);
            MyLinkedList curNode = head;

            for (int i = 0; i < index - 1; i++) {
                if (curNode == null) return;
                curNode = curNode.next;
            }

            newNode.next = curNode.next;
            curNode.next = newNode;
            size++;
        }


        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) return;

            if (index == 0) {
                head = head.next;
            } else {
                MyLinkedList curNode = head;
                for (int i = 0; i < index - 1; i++) {
                    curNode = curNode.next;
                }
                if (curNode.next != null) {
                    curNode.next = curNode.next.next;
                }
            }
            size--;
        }

    }
}
