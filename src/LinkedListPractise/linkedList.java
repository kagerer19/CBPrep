package LinkedListPractise;

public class linkedList {
    static Node head = null;
    public Node tail = null;

    //add a node to the end of the linked list
    public void add(int data) {
        StringBuilder message = new StringBuilder();
        message.append("Adding new node with value").append(data)
                .append(" at the end of the list");

        //Creating a new node
        Node new_node = new Node(data);
        if (head == null) {
            //When list is empty, point to new_node
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            tail = new_node;
        }
    }

    //Insert a node at a specified position
    public static void add(int pos, int data) {
        Node headNode = head;
        StringBuilder message = new StringBuilder();

        if (pos < 0) {
            message.append("Position is not valid");
            System.out.println(message);
        } else {
            if (pos == 1) {
                Node new_node = new Node(data);
                new_node.next = headNode;
                head = new_node;
            } else {
                while (pos-- != 0) {
                    if (pos == 1) {
                        Node new_node = new Node(data);
                        new_node.next = headNode.next;
                        headNode.next = new_node;
                        break;
                    }
                    headNode = headNode.next;
                }
                message.append("added")
                        .append(" -> ");
                if (pos != 1) {
                    message.append("Position is out of bounds");
                    System.out.println(message);
                }
            }
        }
    }

    //Get size of list
    public int size() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    //Get value from a specific position
    public static void get(int index) {
        Node current = head;
        int counter = 0;
        StringBuilder message = new StringBuilder();

        if (head == null) {
            message.append("List is empty");
            System.out.println(message);
            return;
        }

        while (current.next != null && counter < index) {
            current = current.next;
            counter++;
            if (counter == index) {
                break;
            }
        }
        message.append("The value at the current location is: ").append(current.data)
                .append(" At the index ").append(index);
        System.out.println(message);
    }

    public static void remove(int index) {
        if (index == 1) {
            head = head.next;
        } else {
            Node previous = head;
            int count = 1;
            while (count < index - 1) {
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            previous.next = current.next;
        }
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

    public static void main(String[] args) {
        linkedList list = new linkedList();

        list.add(17);
        System.out.println(list);
        list.add(18);
        System.out.println(list);
        list.add(19);
        System.out.println(list);
        add(4, 20);
        list.add(33);
        System.out.println(list);
        list.add(41);
        System.out.println(list);
        list.add(23);
        System.out.println(list);
        remove(5);
        System.out.println(list);
        remove(4);
        System.out.println(list);
        remove(3);
        System.out.println(list);
        remove(2);
        System.out.println(list);
        remove(1);
        System.out.println(list);


        System.out.println("-".repeat(20));
        System.out.println("The size of this Linked list is:  " + list.size());
        get(1);
    }
}
