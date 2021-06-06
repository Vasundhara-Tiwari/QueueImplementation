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
}
