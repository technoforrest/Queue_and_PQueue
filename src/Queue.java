/**
 * This program takes input from userr and places it in a queue or priority queue
 * CPSC 224-01, Spring 2018
 * Programming Assignment #4
 *
 * @author Danielle Forrest
 * @version v1.0 2/23/18
 */

public class Queue {
    protected final Task[] taskArr;
    protected int front = -1;//front of queue is first out
    protected int back = -1;
    protected int count;
    private final int maxSize;

    /**
     * Constructor
     */
    Queue(int s) {
        count = 0;
        maxSize = s;
        taskArr = new Task[maxSize];
    }


    /**
     * Determines if queue is empty or not
     *
     * @return true if queue is empty or false if it is not
     */
    public boolean isEmpty() { // check whether the queue is empty
        return count == 0;
    }

    /**
     * Determines if queue is full or not
     *
     * @return true if queue is full or false if it is not
     */
    public boolean isFull() { //check whether the queue is already full
        return (count == maxSize);
    }

    /**
     * adds newTask to the end of the queue
     *
     * @param newTask is the name and priority determined by user in QueueTest
     */
    public void enqueue(Task newTask) {
        if (isFull()) {
            System.out.println("Queue is Full");
        }
        if (front == -1)
            front = 0;

        if (back == maxSize - 1) {
            back = 0;
            taskArr[back] = newTask;
        } else
            taskArr[++back] = newTask;

        count++;
    }

    /**
     * simply remove the first task from the queue.
     */
    public void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }
        taskArr[front] = null;
        if (front == maxSize - 1)
            front = 0;
        else
            front++;
        count--;
    }

    /**
     * displays all tasks in the queue from “front” to “back”
     */
    public void display() {
        if (back >= front) {
            for (int i = front; i <= back; i++) {
                System.out.println(taskArr[i].getDescription());
            }
        } else {
            for (int i = front; i < count; i++) {
                System.out.println(taskArr[i].getDescription());
            }
            for (int i = 0; i <= back; i++) {
                System.out.println(taskArr[i].getDescription());
            }
        }
    }
}
