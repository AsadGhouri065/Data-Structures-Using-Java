package PackageList;

public class SinglyLinkedList {

    // Head referred to the front of the list

    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    /*
     * 
     * This method inserts an element at the head
     * 
     */

    public void insertHead(int x) {
        Node newNode = new Node(x); // Create a new link with a value attached to it
        newNode.next = head; // Set the new link to point to the current head
        head = newNode; // Now set the new link to be the head
    }

    /*
     * 
     * Inserts a new node at a specified position
     * 
     * @param head - head node of the linked list
     * 
     * @param data - data to be stored in a new node
     * 
     * @param position - position at which a new node is to be inserted
     * 
     * @return - reference of the head of the linked list
     */

    Node insertNth(Node head, int data, int position) {
        Node newNode = new Node();
        newNode.data = data;

        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        Node current = head;

        while (--position > 0) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    public Node deleteHead() {
        Node temp = head;
        head = head.next; // make the second element in the list the new head, the java garbage collector
                          // will later remove the old head
        return temp;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.next;
        }
        System.out.println();
    }

}
