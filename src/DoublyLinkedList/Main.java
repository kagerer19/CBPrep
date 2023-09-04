package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> dList = new DoubleLinkedList<>();

        dList.add(56);
        dList.add(57);
        dList.add(58);
        dList.add(59);
        dList.add(60);
        dList.add(61);
        dList.add(62);
        dList.add(63);

        System.out.println("Print list");
        System.out.println(dList);

        System.out.println("-Reverse list-");
        System.out.println(dList.toStringReverse());

        System.out.println("\nThe list has " + dList.size() + " items");
        System.out.println("The value at index 0 is: " + dList.get(0));
        System.out.println("Removing node at index 0");
        dList.remove(0);

        System.out.println("_".repeat(10));
        System.out.println("Updated list:");
        System.out.println("The list has " + dList.size() + " items");
        System.out.println("The value at index 0 is: " + dList.get(0));

        System.out.println("Print list");
        System.out.println(dList);

        System.out.println("-Reverse list-");
        System.out.println(dList.toStringReverse());
    }
}
