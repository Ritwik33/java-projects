package com.practice;

import java.util.*;

public class Collections {
    public static void main(String[] args) {

        // Array-list
        ArrayList<String> list = new ArrayList<>();
        list.add("monday"); // adds elements to array-list ...
        list.add("tuesday"); // uses a dynamic array in the background ...
        list.add("wednesday");
        list.add("thursday");
        list.add("friday");
        list.add("saturday");
        list.add("sunday");
        Iterator itr = list.iterator(); // iterator initialisation
        while(itr.hasNext()) System.out.print(itr.next() + " ");
        System.out.println("\n");

        // linked-list
        LinkedList<String> cars = new LinkedList<>();
        cars.add("bmw"); // uses a doubly linked list in the background ...
        cars.add("lamborghini");
        cars.add("audi");
        cars.add("mercedes");
        cars.add("maserati");
        System.out.println(cars); // linked list can be printed without an iterator ...
        // it first coverts the linked list to a string then prints it ...
        System.out.println();

        // Vector
        // dynamic array is used to store the data elements ...
        Vector<String> vec = new Vector<>();
        vec.add("one");
        vec.add("two");
        vec.add("three");
        vec.add("four");
        Iterator it = vec.iterator();
        while(it.hasNext()) System.out.print(it.next() + " ");
        System.out.println("\n");

        // Stack
        // it is a subclass of vector ...
        // LIFO data-structure ...
        Stack<String> stack = new Stack<>();
        stack.add("one");
        stack.add("two");
        stack.add("three");
        Iterator itrr = stack.iterator();
        while(itrr.hasNext()) {
            System.out.println(stack.pop());
        }
        System.out.println();

        // Queue-interface
        // maintains a first-in-first-out data-structure ...
        // can be seen as an ordered pair of items that are to be processed ...
        // priority-queue, deque, array-deque all implements queue interface ...

        // priority-queue
        // maintains a set of items that are to be processed
        // elements are processed according to their priorities
        // cannot store null values

        PriorityQueue<String> q = new PriorityQueue<>(); // stores everything in a sorted fashion
        q.add("amit"); // in case of strings, stores lexicographically and in case of integers stores in asc order
        q.add("ritwik");
        q.add("chetna");
        q.add("anamica");
        System.out.println(q.element()); // differs from peek only in that when queue is empty it throws an exception
        System.out.println(q.peek()); // returns the head of the queue without removing it
        System.out.println(q.poll()); // returns null if queue is empty
        System.out.println(q.remove()); // differs from poll only in that it throws an exception when queue is empty
        System.out.println("\n");

        PriorityQueue<Integer> qint  = new PriorityQueue<>();
        qint.add(12);
        qint.add(9);
        qint.add(20);
        qint.add(500);
        qint.add(5);
        while(qint.iterator().hasNext()) System.out.print(qint.poll() + " ");
        System.out.println("\n");

        // Deque-interface (articulated deck)
        // elements can be added or deleted from both ends
        // array deque is faster than array list and stack and has no memory restrictions
        Deque<String> dq = new ArrayDeque<>();
        dq.add("ritwik");
        dq.add("rishi");
        dq.add("payal");
        dq.add("ramashis");
        for(String str:dq) {
            System.out.println(str);
        }
        System.out.println("\n");

        // Set interface
        // unordered set of elements which does not allow storing of duplicates
        // Set can be implemented by hashset, treeset, linkedhashset

        HashSet<String> hs = new HashSet<>();
        hs.add("ritwik");
        hs.add("rishi");
        hs.add("ritwik");
        hs.add("pagol rishi");
        for(String str:hs) System.out.println(str);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(12);
        lhs.add(25);
        lhs.add(1);
        lhs.add(256);
        lhs.add(256);
        for(int i:lhs) System.out.println(i);
        System.out.println("\n");

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(54);
        ts.add(-2);
        ts.add(98);
        ts.add(5);
        ts.add(98);
        for(int i:ts) System.out.println(i);
        System.out.println("\n");


    }
}
