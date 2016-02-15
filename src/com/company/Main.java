package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        String filename = "Q:\\Text.txt";
        if (args.length > 0)
            filename = args[0];

        for(String line : new TextFile(filename))
            System.out.println(line);


//        int time = 10;//Integer.parseInt(args[0]);
//        Queue<Integer> queue = new LinkedList<Integer>();
//
//        for (int i = time; i >= 0; i--) {
//            queue.add(i);
//        }
//
//        while (!queue.isEmpty()) {
//            System.out.println(queue.remove());
//            Thread.sleep(1000);
//        }

        //heapSort();

    }

    static void heapSort() {
        Random rand = new Random();

        ArrayList<Integer> nonSortedArray = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            nonSortedArray.add(rand.nextInt());
        }

        System.out.println("Non sorted array:");
        for (Integer integer : nonSortedArray) {
            System.out.println(integer);
        }

        Queue<Integer> queue = new PriorityQueue<Integer>(nonSortedArray);
        List<Integer> result = new ArrayList<Integer>();

        while (!queue.isEmpty()) {
            result.add(queue.remove());
        }

        System.out.println("\nSorted array:");
        for (Integer integer : result) {
            System.out.println(integer);
        }

    }
}
