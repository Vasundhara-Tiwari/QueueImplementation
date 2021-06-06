package queue;

import java.util.Scanner;

public class CircularQueueArray {
    int [] arr;
    int front, rear;
    static Scanner scanner = new Scanner(System.in);
    public CircularQueueArray(){
        arr = new int[10];
        front = -1;
        rear = -1;
    }
    public void enqueue(){
        if((rear == arr.length-1 && front == 0) || (rear == front-1)){
            System.out.println("Circular Queue is full!!!");
        } else {
            System.out.println("Enter data:");
            int data = scanner.nextInt();

            if(front == -1){
                front=0;
            }
            if (rear < arr.length-1){
                rear++;
            } else if(rear == arr.length-1 && front != 0){
                rear=0;
            }
            arr[rear] = data;
            System.out.println("Data inserted successfully!!!");
        }
    }
    public void dequeue(){
        if(front == -1 || rear == -1){
            System.out.println("Circular Queue is empty!!!");
        } else {
            if(front == rear){
                System.out.println("Element deleted :"+ arr[front]);
                front = -1;
                rear = -1;
            } else if( front < rear) {
                System.out.println("Element deleted :"+ arr[front]);
                front = front + 1;
            } else if (front == arr.length -1) {
                System.out.println("Element deleted :"+ arr[front]);
                front = 0;
            } else if (rear < front){
                System.out.println("Element deleted :"+ arr[front]);
                front += 1;
            }
        }
    }
    public void traverse(){
        if(front == -1 || rear == -1){
            System.out.println("Circular Queue is empty!!!");
        } else {
            if(front <= rear){
                for(int i=front; i<=rear; i++)
                    System.out.println(arr[i]);
            } else {
                for(int i=front; i<=arr.length-1; i++)
                    System.out.println(arr[i]);
                for(int i=0; i<=rear; i++)
                    System.out.println(arr[i]);
            }
        }
    }
    public void peek(){
        if(front == -1 || rear == -1){
            System.out.println("Queue is Empty!!!");
        } else {
            System.out.println("Last element :- "+arr[rear]);
        }
    }
}
