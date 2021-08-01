package PackageStack;

public class Stack {

    private int maxSize;

    private int[] stackArray;

    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    /*
     * 
     * Adds an element to top of the stack
     * 
     */

    public void push(int value) {
        if (!isFull()) {
            top++;
            stackArray[top] = value;
        } else {
            resize(maxSize * 2);
            push(value);
        }
    }

    /*
     * 
     * Removes the top element of the stack and returns the value you've removed
     * 
     */

    public int pop() {
        if (!isEmpty()) { // Checks for an empty stack
            return stackArray[top--];
        }

        if (top < maxSize / 4) {
            resize(maxSize / 2);
            return pop();
        } else {
            System.out.println("The stack is already empty");
            return -1;
        }
    }

    /*
     * 
     * Returns the element at the top of the stack
     * 
     */

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("The stack is empty, cant peek");
            return -1;
        }
    }

    /*
     * 
     * resize the array
     * 
     */

    private void resize(int newSize) {
        int[] transferArray = new int[newSize];

        for (int i = 0; i < stackArray.length; i++) {
            transferArray[i] = stackArray[i];
            stackArray = transferArray;
        }
        maxSize = newSize;
    }

    /*
     * 
     * returns true if the stack is empty
     * 
     */

    public boolean isEmpty() {
        return (top == -1);
    }

    /*
     * 
     * returns true if the stack is full
     * 
     */

    public boolean isFull() {
        return (top + 1 == maxSize);
    }

    /*
     * 
     * Deletes everything in the stack
     * 
     */

    public void makeEmpty() {
        top = -1;
    }

}
