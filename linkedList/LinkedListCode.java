package linkedList;

public class LinkedListCode {
    public static void main(String[] args) {

        Linkedlist nums = new Linkedlist();
        nums.display();

        nums.add(5);
        nums.add(9);

        nums.add(6);

        nums.addFirst(1);

        nums.display();
        nums.delete(9);
        nums.delete(1);
        nums.display();

    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Linkedlist {

    Node head;

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        Node current = head;

        System.out.print("[ ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("]");
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        System.out.println("Element Not Found");
    }

}