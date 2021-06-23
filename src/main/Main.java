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
        if(c == 1){
            while (true) {
                System.out.println("Press 1 for insertAtLast:");
                System.out.println("Press 2 for deleteAtBegin:");
                System.out.println("Press 3 for traverse:");
                System.out.println("Press 4 to exit:");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        obj1.enqueue();
                        break;
                    case 2:
                        obj1.dequeue();
                        break;
                    case 3:
                        obj1.traverse();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong choice !!!");
                }
            }
        }
        else if (c == 2){
            while (true) {
                System.out.println("Press 1 for insertAtLast:");
                System.out.println("Press 2 for deleteAtBegin:");
                System.out.println("Press 3 for traverse:");
                System.out.println("Press 4 to exit:");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        obj2.enqueue();
                        break;
                    case 2:
                        obj2.dequeue();
                        break;
                    case 3:
                        obj3.traverse();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong choice !!!");
                }
            }
        }
        else if(c  == 3) {
            while (true) {
                System.out.println("Press 1 for insertAtLast:");
                System.out.println("Press 2 for deleteAtBegin:");
                System.out.println("Press 3 for traverse:");
                System.out.println("Press 4 to exit:");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        obj3.enqueue();
                        break;
                    case 2:
                        obj3.dequeue();
                        break;
                    case 3:
                        obj3.traverse();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    case 5:
                        obj3.peek();
                        break;
                    case 6:
                        obj3.poll();
                        break;
                    default:
                        System.out.println("Wrong choice !!!");
                }
            }
        }
    }
}
