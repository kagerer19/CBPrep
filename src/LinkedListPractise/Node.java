package LinkedListPractise;

class node<T> {
    node<T> head;
    T data;
    node<T> next;

    node(T data)
    {
        this.data = data;
        this.next = null;
    }
}