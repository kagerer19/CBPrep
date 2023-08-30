package LinkedListPractise;

public class Main {
    public static void main(String[] args) {
        LList list = new LList();

        list.add(17);
        list.add(18);
        list.add(new Node(569));

        System.out.println(list);
        System.out.println("The size of this Linked list is:  " + list.size());


        System.out.println(list);
        list.remove(1);
        System.out.println("-".repeat(20));
        System.out.println("The size of this Linked list is:  " + list.size());

        list.get(6);
    }
}
