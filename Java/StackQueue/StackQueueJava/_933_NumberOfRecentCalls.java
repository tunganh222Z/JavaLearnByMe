package StackQueue.StackQueueJava;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class _933_NumberOfRecentCalls {
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        recentCounter.ping(1);
        recentCounter.ping(100);
        recentCounter.ping(3001);
        recentCounter.ping(3002);

    }
    static class RecentCounter { // using queue java library
        Queue<Integer> queue;

        public RecentCounter() {
            queue = new PriorityQueue<>();
        }

        public int ping(int t) {
            queue.add(t);

            while (!queue.isEmpty() && queue.peek() < t-3000){
                queue.remove();
            }

            return queue.size();
        }
    }


    static class RecentCounter1 {

        private class node {
            int val;
            private node next;

            node(int value){
                this.val = value;
            }
        }
        node head;
        node tail;
        public RecentCounter1() {
            head = tail = null;
        }

        public int ping(int t) {
            node newNode = new node(t);
            if (head == null){
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }

            while (head != null && head.val < t - 3000){
                head = head.next;
            }

            node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
}
