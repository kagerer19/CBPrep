package TheQueue;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        IntQueue myQueue = new IntQueue();

        myQueue.enqueue(56);
        myQueue.enqueue(57);
        myQueue.enqueue(58);
        myQueue.enqueue(59);
        myQueue.enqueue(60);
        myQueue.enqueue(61);
        myQueue.enqueue(62);
        myQueue.enqueue(63);

        System.out.println("\nThe list has " + myQueue.size() + " items");
        System.out.println("Print list");
        System.out.println(myQueue);

        System.out.println("-Reverse list-");
        System.out.println(myQueue.queueList.toStringReverse());

        System.out.println(myQueue.dequeue());

        /*myQueue.dequeue(0);*/

        System.out.println("_".repeat(10));

        System.out.println("Print list");
        System.out.println(myQueue);

        System.out.println("-Reverse list-");
        System.out.println(myQueue.queueList.toStringReverse());


        System.out.println(Arrays.toString(myQueue.dequeue(1)));
    }
}
