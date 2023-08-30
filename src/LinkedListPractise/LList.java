package LinkedListPractise;

public class LList {
    static Node head = null;
    public Node tail = null;

    int size = 0;

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
        size++;
    }

    //Add method for Boolean add();
    public boolean add(Node e) {
        add(e.data);
        return true;
    }

    //Insert a node at a specified position
    public void add(int pos, int data) {
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
        size++;
    }

    //Get size of list
    public int size() {
        return  size;
    }

    //Get value from a specific position
    public void get(int index) {
        Node current = head;
        int counter = 0;
        StringBuilder message = new StringBuilder();

        if (current == null) {
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
                .append(" At the index ").append(counter);
        System.out.println(message);
    }

    public void remove(int index) {
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
        size--;
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
}
