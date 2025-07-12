import java.util.*;

public class CircularQueue {
    private int[] queue;
    private int front, rear;
    private int size;
    private final int CAPACITY = 5;

    public CircularQueue() {
        queue = new int[CAPACITY];
        front = rear = -1;
        size = 0;
    }

    // Checks if the queue is full
    public boolean isFull() {
        return size == CAPACITY;
    }

    // Checks if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Adding an element at the rear of the queue
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue.");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % CAPACITY;
        queue[rear] = data;
        size++;
    }

    // Removing  the element from the front of the queue and returning it
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int removedData = queue[front];
        if (front == rear) { // Last element being dequeued
            front = rear = -1;
        } else {
            front = (front + 1) % CAPACITY;
        }
        size--;
        return removedData;
    }

    // Peeking the element at the front of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No element to Peek.");
            return -1;
        }
        return queue[front];
    }

    // Main method for testing
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue();

        circularQueue.isEmpty(); // Circular Queue is now Empty

        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.enqueue(40);
        circularQueue.enqueue(50); // Circular Queue is now Full
        circularQueue.enqueue(60); // Attempt to enqueue when Circular Queue is Full

        System.out.println("Front element: " + circularQueue.peek());
        
        while (!circularQueue.isEmpty()) {
            circularQueue.dequeue();
        }

        System.out.println("Front element after operations : " + circularQueue.peek());

        circularQueue.dequeue(); // Attempt to dequeue when empty
    }
}