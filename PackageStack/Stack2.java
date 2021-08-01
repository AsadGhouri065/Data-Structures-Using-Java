package PackageStack;

import java.util.ArrayList;

public class Stack2 {

    ArrayList<Integer> stackList;

    public Stack2() {
        stackList = new ArrayList<>();
    }

    /*
     * Adds value to the end of list which is the top for stack
     * 
     */

    public void push(int value) {
        stackList.add(value);
    }

    /*
     * 
     * Pops last element of list which is indeed the top for stack
     * 
     */

    public int pop() {
        if (!isEmpty()) {
            int popValue = stackList.get(stackList.size() - 1);
            stackList.remove(stackList.size() - 1); // removes the poped element from the list
            return popValue;
        } else {
            System.out.println("The stack is already empty");
            return -1;
        }
    }

    /*
     * 
     * Checks for empty stack
     * 
     */

    public boolean isEmpty() {
        if (stackList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Top element of stack
     * 
     * 
     */

    public int peek() {
        return stackList.get(stackList.size() - 1);
    }

}
