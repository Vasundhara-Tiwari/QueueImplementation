package main;

import queue.CircularQueueArray;
import queue.SinglyQueueArray;
import queue.SinglyQueueLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyQueueArray obj1 = new SinglyQueueArray();
        SinglyQueueLinkedList obj2 = new SinglyQueueLinkedList();
        CircularQueueArray obj3 = new CircularQueueArray();
        System.out.println("Enter you choice:");
        System.out.println("Press 1 for Singly Queue Array");
        System.out.println("Press 2 for Singly Queue Linked List");
        System.out.println("Press 3 for Circular Queue");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
    }
}
