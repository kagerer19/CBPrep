package TheStack;

import DoublyLinkedList.DoubleLinkedList;

import java.util.Arrays;
import java.util.Stack;

import static TheStack.IntStack.*;

public class Main {
    public static void main(String[] args){
        IntStack myStack = new IntStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(99);
        myStack.push(5);

        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack.size());
        System.out.println(myStack);
        System.out.println(myStack.peek());

        System.out.println(Arrays.toString(myStack.pop(4)));


    }
}
// Check following functionality
//1). push(int newElement) inserts a new element on top of the stack
//2). int size() returns the number if elements in the stack
//3). int pop() returns the last element in the stack and removes it from the stack
//4). int peek() returns the last element of the stack without modifying the stack
//5). int[] pop(int n) returns the last n elements of the stack and returns them from the stack

// Additionally calling pop() or peek() on an empty stack should return an error message
























