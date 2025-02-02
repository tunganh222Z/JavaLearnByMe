package StackQueue;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode node4 = new ListNode(3, null);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(0, node2);

        System.out.println("--------------");

        printNode(node1);

        node1 = reverseList(node1);
        printNode(node1);

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        return null;
    }

    public static ListNode reverseList (ListNode head){
        ListNode curNode = head;
        while (curNode.next != null){
            ListNode nextNode = curNode.next;

            curNode.next = nextNode.next;

            nextNode.next = head;

            head = nextNode;

        }
        return head;
    }

    public static ListNode removeNodeAtIndex(ListNode head, int index) {
        if (head == null || index < 0) {
            return null;
        } else if (index == 0) {
            removeHeadNode(head);
        } else {
            ListNode curNode = head;
            ListNode prevNode = null;
            int count = 0;
            while (curNode.next != null){
                count++;
                prevNode = curNode;
                curNode = curNode.next;
                if (count == index){
                    prevNode.next = curNode.next;
                    break;
                }
            }
        }
        return head;
    }


    public static ListNode removeLastNode(ListNode head) {
        ListNode prevNode = null;
        if (head != null) {

            ListNode lastNode = head;
            while (lastNode.next != null) {
                prevNode = lastNode;
                lastNode = lastNode.next;
            }

            if (prevNode != null) {
                prevNode.next = lastNode.next;
            } else {
                return null;
            }
        } else {
            return null;
        }
        return head;
    }

    public static ListNode removeHeadNode(ListNode head) {
        if (head != null) {
            head = head.next;
        }
        return head;
    }

    public static ListNode addToIndex(ListNode head, int value, int index) {
        ListNode newNode = new ListNode(value);
        if (index == 0) {
            return addToHead(head, value);
        } else {
            ListNode curNode = head;
            int count = 0;
            while (curNode.next != null) {
                count++;
                if (count == index) {
                    newNode.next = curNode.next;
                    curNode.next = newNode;

                    break;
                }
                curNode = curNode.next;
            }
        }
        return head;
    }

    public static ListNode addAtTail(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head != null) {
            ListNode lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        } else {
            return newNode;
        }
        return head;
    }

    public static ListNode addToHead(ListNode head, int value) {
        ListNode newNode = new ListNode(value);

        if (head == null) {
            return newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    public static void printNode(ListNode node) {
        if (node == null) {
            System.out.println("List empty!");
        } else {
            ListNode temp = node;
            while (temp != null) {
                System.out.print(temp.val);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
