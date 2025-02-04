package StackQueue;

import java.util.Scanner;

public class _83_RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();

    }

    static public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curNode = head.next;
        ListNode prevNode = head;

        while (curNode != null){
            ListNode temp = new ListNode();
            if (prevNode.val == curNode.val){
                prevNode.next = curNode.next;
            } else {
                prevNode = curNode;
            }
            curNode = curNode.next;

        }
        return head;
    }

    static public class ListNode {
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
