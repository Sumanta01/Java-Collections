package com.epam.collection;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(5);
        pq.add(3);
        pq.add(8);
        pq.add(7);
        System.out.println(pq);

        System.out.println( pq.peek());
        System.out.println(pq.poll());



    }
}
