package StackQueue;

import java.util.Scanner;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListNode list1 = inputNode(sc);

        ListNode list2 = inputNode(sc);

        ListNode mergeNode = mergeTwoLists(list1, list2);

        printNode(mergeNode);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode curNode = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val){
                curNode.next = list1;
                list1 = list1.next;
            } else {
                curNode.next = list2;
                list2 = list2.next;
            }
            curNode = curNode.next;
        }

        if (list1 != null){
            curNode.next = list1;
        } else {
            curNode.next =list2;
        }

        return head.next;
    }

    public static int getNodeIndex (ListNode head, int index){
        ListNode newNode = head;
        int count = 0;
        while (count < index){
            count++;
            newNode = newNode.next;
        }
        return newNode.val;
    }

    public static ListNode inputNode (Scanner sc){
        int n = sc.nextInt();
        ListNode curNode = null;
        ListNode head = null;
        for (int i =0; i < n; i++){
            ListNode newNode = new ListNode(sc.nextInt());
            if (head == null){
                head = newNode;
                curNode = head;
            } else {
                curNode.next = newNode;
                curNode = newNode;
            }
        }
        return head;
    }

    public static ListNode printNode(ListNode head){
        ListNode curNode = head;

        if (curNode != null){
            while (curNode != null){
                System.out.print(curNode.val);

                curNode = curNode.next;

                if (curNode != null){
                    System.out.print("->");
                }
            }
        } else {
            System.out.println("List is empty");
        }
        System.out.println();
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode (){}

        public ListNode (int val){
            this.val = val;
        }

        public ListNode (int val, ListNode nextNode){
            this.val = val;
            this.next = nextNode;
        }
    }
}
