package queue;

import java.util.Scanner;

public class SinglyQueueArray {
    int[] arr;
    int rear, front;
    static Scanner scanner = new Scanner(System.in);
    public SinglyQueueArray(){
        arr = new int[10];
        rear = -1;
        front = -1;
    }
    public void enqueue(){
        int data = scanner.nextInt();
        if(rear == arr.length-1){
            System.out.println("Queue is Full!!");
        } else {
            rear++;
            arr[rear] = data;
            System.out.println("insertion successful!!");
            if(front == -1){
                front=0;
            }
        }
    }
    public  void dequeue(){
        if(front == -1 || rear == -1){
            System.out.println("Queue is empty!!!");
        } else {
            if(front == rear){
                System.out.println("Element deleted:-"+arr[front]);
                front=-1;
                rear=-1;
            }
            else {
                System.out.println("Element deleted" + arr[front]);
                front++;
            }
        }
    }
    public void traverse(){
        if(front == -1 || rear == -1){
            System.out.println("Queue is empty!!!");
        } else {
            for(int i=front; i<=rear; i++){
                System.out.println(arr[i]+" ");
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
