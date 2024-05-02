package stackDsa;

public class Stack {
    int stack[] = new int[3];
    int top = 0;

    public void push(int data) {
        if (top == 3) {
            System.out.println("stack is full");
        } else {
            stack[top] = data;
            top++;
        }
    }

    public void show() {
        for (int i : stack) {
            System.out.print(i + " ");
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("stack is empty ");
        } else {
            int data = 0;
            data = stack[top - 1];
            System.out.println("peeked value " + data);
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("stack is empty ");
        } else {
            int data;
            top--;
            data = stack[top];
            stack[top] = 0;
            System.out.println("popped value " + data);
        }
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("size  " + stack.size());
        stack.peek();
        stack.pop();
        System.out.println("empty " + stack.isEmpty());
        stack.show();
    }
}
