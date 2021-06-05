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
        }
    }
    public  void dequeue(){

    }
    public void traverse(){

    }
}
