package main;

import queue.CircularQueueArray;
import queue.SinglyQueueArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyQueueArray obj1 = new SinglyQueueArray();
        CircularQueueArray obj2 = new CircularQueueArray();
        while (true) {
            System.out.println("Press 1 for insert:");
            System.out.println("Press 2 for delete:");
            System.out.println("Press 3 for traverse:");
            System.out.println("Press 4 to exit:");
            System.out.println("Press 5 to find peak element:");
            System.out.println("Press 6 to find poll element");

            Scanner scanner = new Scanner(System.in);

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    //obj1.enqueue();
                    //obj2.enqueue();
                    break;
                case 2:
                    //obj1.dequeue();
                    //obj2.dequeue();
                    break;
                case 3:
                    //obj1.traverse();
                    //obj2.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    //obj1.peek();
                    //obj2.peek();
                    break;
                case 6:
                    //obj1.poll();
                    //obj2.peek();
                    break;
                default:
                    System.out.println("Wrong choice !!!");
            }
        }
    }
}
