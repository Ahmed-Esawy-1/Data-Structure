package queue;

public class QueueCode {
    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.dequeue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(5);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();

        queue.enqueue(99);
        queue.enqueue(99);

        System.out.println(queue.dequeue());
        queue.enqueue(12);
        
        queue.display();
        queue.enqueue(100);

    }
}

class Queue {

    int front = 0;
    int rear = -1;
    int size = 0;
    int[] arr = new int[4];

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        rear++;
        arr[rear] = data;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        int data = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }

        rear--;
        size--;
        return data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("[ ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear == arr.length - 1;
    }
}