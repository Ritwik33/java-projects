package com.BasicDataStructures;

import java.util.Scanner;

public class LinkedList1 {

    public Node head = null;

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
        Node ptr = head;
        while(ptr.next != null) ptr = ptr.next;
        Node newNode = new Node(nodeData);
        ptr.next = newNode;
    }

    public void addAtPos(int nodeData, int pos) {
        Node newNode = new Node(nodeData);
        Node curr = head;
        Node prev = null;
        int count = 1;
        while(curr != null && count<pos) {
            count++;
            prev = curr;
            curr = curr.next;
        }
        prev.next = newNode;
        newNode.next = curr;
    }

    public void deltAtBeg() {
        head = head.next;
        System.out.println("beginning node deleted");
    }

    public void deltAtEnd() {
        Node ptr = head;
        while(ptr.next.next != null) ptr = ptr.next;
        ptr.next = null;
        System.out.println("end node deleted");
    }

    public void deltAtPos(int pos) {
        int count = 1;
        Node curr = head;
        Node prev = null;
        while(curr != null && count<pos) {
            count++;
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        System.out.println("Node deleted from position: " + pos);
    }

    public void display() {
        Node ptr = head;
        System.out.print("Linked list: ");
        while(ptr!=null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        System.out.println("---- MAIN MENU ----");
        System.out.println("1. Add a node at beginning");
        System.out.println("2. Add a node at end");
        System.out.println("3. Add a node at any position");
        System.out.println("4. Delete a node from beginning");
        System.out.println("5. Delete a node from end");
        System.out.println("6. Delete a node from a position");
        System.out.println("7. Display linked list");
        System.out.println("8. EXIT");
        System.out.println("-------------------");
        int choice, nodeData, pos;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Enter data: ");
                    nodeData = sc.nextInt();
                    ll.addAtBeg(nodeData);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    nodeData = sc.nextInt();
                    ll.addAtEnd(nodeData);
                    break;
                case 3:
                    System.out.print("Enter data: ");
                    nodeData = sc.nextInt();
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    ll.addAtPos(nodeData, pos);
                    break;
                case 4:
                    ll.deltAtBeg();
                    break;
                case 5:
                    ll.deltAtEnd();
                    break;
                case 6:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    ll.deltAtPos(pos);
                    break;
                case 7:
                    ll.display();
                    break;
            }
        }while(choice >= 1 && choice <= 7);
    }
}

