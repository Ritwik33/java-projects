package com.BasicDataStructures;

public class PairWiseSwap {

    Node head = null;

    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void addAtBeg(int nodeData) {
        Node newNode = new Node(nodeData);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(int nodeData) {
        Node newNode = new Node(nodeData);
        if(head == null) {
            head = newNode;
        } else {
            Node ptr = head;
            while(ptr.next != null) ptr = ptr.next;
            ptr.next = newNode;
        }
    }

    public void print() {
        Node ptr = head;
        while(ptr!=null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }

    public void pairwiseswap() {
        Node ptr = head;
        while(ptr != null && ptr.next != null) {
            int temp = ptr.data;
            ptr.data = ptr.next.data;
            ptr.next.data = temp;
            ptr = ptr.next.next;
        }
    }

    public static void main(String[] args) {
        PairWiseSwap obj = new PairWiseSwap();
        obj.addAtEnd(1);
        obj.addAtEnd(2);
        obj.addAtEnd(3);
        obj.addAtEnd(4);
        obj.addAtEnd(5);
        //obj.addAtEnd(6);
        obj.print();
        obj.pairwiseswap();
        System.out.println();
        obj.print();
    }
}
