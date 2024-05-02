package queueDsa;

public class Queue {
    int queue[] = new int[4];
    int size;
    int rear;
    int front;


    private void enQueue(int data) {
        queue[rear] = data;
        rear = (rear + 1) % 4;
        size++;
    }

    private void deQueue() {
        int data = queue[front];
        front = (front + 1) % 4;
        size--;
        System.out.println("deleted value " + data);
    }

    private void poll() {
        int data = queue[front];
        System.out.println("value to be deleted " + data);
    }


    private void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % 4] + " ");
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.poll();
        queue.deQueue();
        queue.enQueue(20);
        queue.enQueue(40);

        queue.show();
    }
}
