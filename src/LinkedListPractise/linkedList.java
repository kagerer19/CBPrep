package LinkedListPractise;

public class linkedList {
    public Node head = null;
    public Node tail = null;

    //add node will add a node to the end of the linked list
    public void addNode(int data){
        System.out.println("Adding new node with value " + data + " at the end of the list");

        //Creating a new node
        Node new_node = new Node(data);
        if(head == null){
            //When list is empty, point to new_node
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            tail = new_node;
        }
    }

    //Display all nodes currently in the list
    public void printData(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        while(current != null){
            //print each node
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
       linkedList list = new linkedList();
       list.addNode(5);
       list.printData();
       list.addNode(6);
       list.printData();
    }
}
