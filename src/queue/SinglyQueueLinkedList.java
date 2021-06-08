package queue;

import java.util.Scanner;

public class SinglyQueueLinkedList {
    static Scanner scanner = new Scanner(System.in);
    Node front;
    Node rear;
    public  SinglyQueueLinkedList(){
        front = null;
        rear = null;
    }
    public void enqueue(){
        Node newNode = new Node();
        newNode.data = scanner.nextInt();
        newNode.next = null;

        if (front == null || rear == null){
            front = newNode;
            rear = newNode;
        } else {
            Node current = front;

            while (current.next !=null){
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Data inserted successfully!!!");
    }
    public void dequeue(){
        if(front == null || rear == null){
            System.out.println("Queue empty!!!");
        } else {
            System.out.println("Element deleted : "+front.data);
            front = front.next;
        }
    }
    public void traverse(){
        Node current;
        if(front == null || rear == null){
            System.out.println("Singly Queue is empty!!!");
        } else {
            for(current = front; current != null; current = current.next){
                System.out.println(" "+current.data);
            }
        }
    }
    public void peek(){
        if( front == null || rear == null){
            System.out.println("Queue is empty!!!");
        } else {
            System.out.println("Last element "+front.data);
        }
    }
    public void poll(){
        if( front == null || rear == null){
            System.out.println("Queue is empty!!!");
        } else {
            System.out.println("Last element "+rear.data);
        }
    }
}
