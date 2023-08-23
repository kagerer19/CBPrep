package LinkedListPractise;

public class linkedList {
    static Node head = null;
    public Node tail = null;

    //add node will add a node to the end of the linked list
    public void addNode(int data) {
        System.out.println("Adding new node with value " + data + " at the end of the list");

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

    //Method for inserting a node at a specified position
    static Node insertNode(Node headNode, int pos, int data) {
        Node head = headNode;
        if (pos < 0) {
            System.out.println("Not valid");
        }

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
            if(pos != 1){
                System.out.println("Out of bounds");
            }
        }
        return head;
    }

    //Display all nodes currently in the list
    public void printData() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        while (current != null) {
            //print each node
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);
        list.addNode(8);
        list.addNode(9);
        list.addNode(10);
        list.addNode(11);
        list.printData();

        insertNode(head, 5, 4);
        list.printData();
    }

    /*boolean add(Node e)
        void    add(int index, Node element)
        int     size()
        Node get(int index)
        Node remove(int index)*/
}
