package LinkedListPractise;

public class linkedList<T> {
    node<T> tail;
    public node<T> head;
    //add a node to the end of the linked list
    public void addNode(T data) {
        StringBuilder message = new StringBuilder();
        message.append("Adding new node with value").append(data)
                .append(" at the end of the list");

        //Creating a new node
        node<T> new_node = new node<>(data);
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
    void insertNode(int pos, T data) {
        node<T> headNode = head;
        StringBuilder message = new StringBuilder();

        if (pos < 0) {
            message.append("Position is not valid");
            System.out.println(message.toString());
        } else {
            if (pos == 1) {
                node<T> new_node = new node<>(data);
                new_node.next = headNode;
                head = new_node;
            } else {
                while (pos-- != 0) {
                    if (pos == 1) {
                        node<T> new_node = new node<>(data);
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
                    System.out.println(message.toString());
                }
            }
        }
    }

    public int getSize() {
        node<T> temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    //Get value from a specific position
    void getValueAtIndexOf(int index) {
        node<T> current = head;
        int counter = 0;
        StringBuilder message = new StringBuilder();

        if (head == null) {
            message.append("List is empty");
            System.out.println(message.toString());
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
        System.out.println(message.toString());
    }

     void deleteNode(int index) {
         if (index == 1) {
          head = head.next;
        } else {
            node<T> previous = head;
            int count = 1;
            while (count < index - 1) {
                previous = previous.next;
                count++;
            }
            node<T> current = previous.next;
            previous.next = current.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        node<T> current = head;

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
        linkedList<Integer> list = new linkedList<Integer>();

        list.addNode(17);
        System.out.println(list.toString());
        list.addNode(18);
        System.out.println(list.toString());
        list.addNode(19);
        System.out.println(list.toString());
        list.insertNode(4, 20);
        list.addNode(33);
        System.out.println(list.toString());
        list.addNode(41);
        System.out.println(list.toString());
        list.addNode(23);
        System.out.println(list.toString());
        list.deleteNode(5);
        System.out.println(list.toString());
        list.deleteNode(4);
        System.out.println(list.toString());
        list.deleteNode(3);
        System.out.println(list.toString());
        list.deleteNode(2);
        System.out.println(list.toString());
        list.deleteNode(1);
        System.out.println(list.toString());


        System.out.println("-".repeat(20));
        System.out.println("The size of this Linked list is:  " + list.getSize());
        list.getValueAtIndexOf(1);
    }
}