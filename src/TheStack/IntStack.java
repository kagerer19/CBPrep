package TheStack;

import DoublyLinkedList.DoubleLinkedList;

class IntStack {
    public DoubleLinkedList<Integer> stackedDList;
    public int size;

    public IntStack() {
        this.size = 0;
        this.stackedDList = new DoubleLinkedList<>();
    }

    public boolean isEmpty(){
       return stackedDList.size() == 0;
    }

    public void push(int newElement) {
        stackedDList.add(newElement);
        size++;
    }

    public int size() {
        return size;
    }

    public int pop() {
        if (!isEmpty()) {
            int poppedElement = stackedDList.get(stackedDList.size() - 1);
            stackedDList.remove(stackedDList.size() - 1);
            size--;
            System.out.println( poppedElement +" has been removed from the end of the stack");
            return poppedElement;
        } else {
            System.out.println("Error: Stack is empty");
            return -1; // Return a default value in case of an empty stack
        }
    }

    public int peek() {
        try {
            return stackedDList.get(stackedDList.size() - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Stack is empty");
            return -1; // Return a default value in case of an exception
        }
    }

    public int[] pop(int n) {
        int[] poppedElements = new int[n];

        for (int i = 0; i < n; i++) {
            poppedElements[i] = pop();
        }
        return poppedElements;
    }

    @Override
    public String toString() {
        return stackedDList.toString();
    }
}