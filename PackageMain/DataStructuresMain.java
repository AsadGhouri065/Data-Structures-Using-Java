package PackageMain;

import PackageList.SinglyLinkedList;
import PackageQueues.GenericArrayListQueue;
import PackageQueues.PriorityQueue;
import PackageQueues.Queue;
import PackageSorts.BubbleSort;
import PackageSorts.InsertionSort;
import PackageSorts.SelectionSort;
import PackageStack.Stack;
import PackageStack.Stack2;

public class DataStructuresMain {
    public static void main(String[] args) {
        Stack myStack = new Stack(4);
        // Populate the stack
        myStack.push(5);
        myStack.push(8);
        myStack.push(2);
        myStack.push(9);

        System.out.println("*********************Stack Array Implementation*********************");
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.isFull());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());

        Stack2 myStack2 = new Stack2();
        // Populate the stack
        myStack2.push(10);
        myStack2.push(20);
        myStack2.push(30);
        myStack2.push(40);

        System.out.println("*********************Stack List Implementation*********************");
        System.out.println(myStack2.isEmpty());
        System.out.println(myStack2.peek());
        System.out.println(myStack2.pop());
        System.out.println(myStack2.peek());
        System.out.println(myStack2.pop());

        System.out.println("*********************SinglyLinkList Implementation*********************");
        SinglyLinkedList myList = new SinglyLinkedList();
        System.out.println(myList.isEmpty());

        myList.insertHead(5);
        myList.insertHead(7);
        myList.insertHead(10);

        myList.display(); // 10(head) --> 7 --> 5
        myList.deleteHead();
        myList.display(); // 7(head) --> 5

        System.out.println("*********************Queue Implementation*********************");
        Queue myQueue = new Queue(4);
        myQueue.insert(10);
        myQueue.insert(2);
        myQueue.insert(5);
        myQueue.insert(3);

        // [10 front, 2, 5, 3 rear];

        System.out.println(myQueue.isFull());
        myQueue.remove(); // Will make 2 the new front, making 10 no longer part of the queue
        // [10, 2(front), 5, 3(rear)]

        myQueue.insert(7); // Insert 7 at the rear which will be index 0 because of wrap around
        // [7(rear), 2(front), 5, 3]

        System.out.println(myQueue.peekFront());
        System.out.println(myQueue.peekRear());

        System.out.println("*********************Priority Queue Implementation*********************");
        PriorityQueue PrioQueue = new PriorityQueue(5);
        PrioQueue.insert(10);
        PrioQueue.insert(6);
        PrioQueue.insert(88);
        PrioQueue.insert(23);
        PrioQueue.insert(90);

        System.out.println("Peek is " + PrioQueue.peek());

        // [88, 23, 10, 6] Here higher numbers have higher priority, so they are on the
        // top

        for (int i = 4; i >= 0; i--) {
            System.out.println(PrioQueue.remove() + " ");
        }
        // As you can see, a Priority Queue can be used as a sorting algorithm

        System.out.println("*********************Generic Arraylist Queue Implementation*********************");
        GenericArrayListQueue<Integer> queue = new GenericArrayListQueue<Integer>();

        System.out.println("Running...");
        assert queue.peek() == null;
        assert queue.poll() == null;
        assert queue.add(1) == true;
        assert queue.peek() == 1;
        assert queue.add(2) == true;
        assert queue.peek() == 1;
        assert queue.poll() == 1;
        assert queue.peek() == 2;
        assert queue.poll() == 2;
        assert queue.peek() == null;
        assert queue.poll() == null;
        System.out.println("Finished.");

        System.out.println("*********************Bubble Sort Implementation*********************");

        BubbleSort bubbleSort = new BubbleSort();
        int[] myArray = { 64, 25, 12, 22, 11 };
        BubbleSort.sort(myArray);
        System.out.println("Sorted Array");
        bubbleSort.printArray(myArray);

        System.out.println("*********************Selection Implementation*********************");
        SelectionSort selectionSort = new SelectionSort();
        int arr[] = { 64, 25, 12, 22, 11 };
        selectionSort.sort(arr);
        System.out.println("Sorted Array");
        selectionSort.printArray(arr);

        System.out.println("*********************Insertion Sort Implementation*********************");
        InsertionSort insertionSort = new InsertionSort();
        int[] insertionArray = { 64, 25, 12, 22, 11 };
        InsertionSort.sort(insertionArray);
        System.out.println("Sorted Array");
        insertionSort.printArray(insertionArray);
    }

}
