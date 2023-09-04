package TheStack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IntStack myStack = new IntStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(99);
        myStack.push(5);
        myStack.push(33);
        myStack.push(32);
        myStack.push(31);

        System.out.println(myStack);
        System.out.println(myStack.stackedDList.toStringReverse());

        System.out.println(myStack.size());
        myStack.pop();
        System.out.println(myStack.peek() + " Is the last element of the stack");

        System.out.println(Arrays.toString(myStack.pop(3)));
    }
}
// Additionally calling pop() or peek() on an empty stack should return an error message
























