package stack;

public class StackCode {
    public static void main(String[] args) {

        Stack nums = new Stack();
        nums.pop();
        nums.peek();
        nums.display();
        nums.push(1);
        nums.push(2);
        nums.push(3);
        nums.push(4);
        nums.push(5);
        nums.push(6);
        nums.display();
        nums.pop();
        System.out.println(nums.peek());
        nums.display();

    }
}

class Stack {

    private int[] arr = new int[5];
    int top;
    int size;

    public Stack() {
        size = arr.length;
        top = -1;
    }

    public void push(int data) {
        if (!isFull())
            arr[++top] = data;
        else
            System.out.println("Stack Overflow");
    }

    public int pop() {
        if (!isEmpty())
            return arr[top--];
        else {
            System.out.println("Stack Underflow");
            return -1;
        }

    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return arr[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("[ ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return size == top + 1;
    }

}