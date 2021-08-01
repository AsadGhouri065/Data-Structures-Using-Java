package PackageList;

/*

    This class is the nodes of the SinglyLinked list
    They Consist of a value and a pointer to the node
    after them

 */

public class Node {

    // The value of the node
    public int value;

    // Point to the next node
    public Node next; // this is what the link will point to
    public int data;

    /*
     * 
     * Constructor
     * 
     * @param valuein - value to be put in the node
     * 
     */

    public Node(int valuein) {
        value = valuein;
    }

    public Node() {

    }

    // returns value of the node

    public int getValue() {
        return value;
    }

}
