package DoublyLinkedList;

import java.util.Stack;

public class DoubleLinkedList<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public Stack myStack;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(T data, int pos) {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }

        if (pos == size) {
            add(data);
        } else if (pos == 0) {
            Node<T> newNode = new Node<>(data);
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        } else {
            Node<T> newNode = new Node<>(data);
            Node<T> current = head;
            for (int i = 0; i < pos - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next.previous = newNode;
            newNode.previous = current;
            current.next = newNode;
        }
        size++;
    }

    public T get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }

        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.previous = null;
            } else {
                tail = null;
            }
        } else if (index == size - 1) {
            tail = tail.previous;
            tail.next = null;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        size--;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;

        if (current == null) {
            result.append("List is empty");
        } else {
            while (current != null) {
                result.append(current.data);
                if (current.next != null) {
                    result.append(" -> ");
                }
                current = current.next;
            }
        }

        return result.toString();
    }

    public String toStringReverse() {
        StringBuilder result = new StringBuilder();
        Node current = tail;

        if (current == null) {
            result.append("List is empty");
        } else {
            while (current != null) {
                result.append(current.data);
                if (current.previous != null) {
                    result.append(" -> ");
                }
                current = current.previous;
            }
        }
        return result.toString();
    }
}