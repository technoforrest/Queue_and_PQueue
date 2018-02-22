import java.util.ArrayList;
import java.util.Arrays;

public class Queue {
    private final Task[] taskArr;
    private int front = -1;//front of queue is first out
    private int back = -1;
    protected int size;
    protected final int maxSize;

    public Queue() {
        taskArr = new Task[0];
        maxSize = 0;

    }
    /**
     * Constructor
     */
    Queue(int s) {
        size = s;
        maxSize = s;
        taskArr = new Task[size];
    }



    /**
     * Determines if queue is empty or not
     * @return true if queue is empty or false if it is not
     */
    public boolean isEmpty() { // check whether the queue is empty

            return size == 0;

    }

    /**
     * Determines if queue is full or not
     * @return true if queue is full or false if it is not
     */
    public boolean isFull() { //check whether the queue is already full
        if ((front == 0 && back == size-1) ||
                (back == front-1))
        {
            System.out.println("Queue is Full");
            return true;
        } else {
            return false;
        }

    }

    /**
     *
     * @return the maximum size of the queue
     */
    protected int getMaxSize(){
        return maxSize;

    }

    /**
     * adds newTask to the end of the queue
     * @param newTask is the name and priority determined by user in QueueTest
     */
    public void enqueue(Task newTask){
        this.isFull();
        if (front == -1) {// Insert First Element
            front = 0;
            back = 0;
            taskArr[back] = newTask;
        } else if (back == (size - 1) && front != 0)
        {
            back = 0;
            taskArr[back] = newTask;
        } else {
            back++;
            taskArr[back] = newTask;
        }

    }

    /**
     * simply remove the first task from the queue.
     */
    public void dequeue(){
        this.isEmpty();
        if (front == -1){
            System.out.println("Queue is Empty");
        }

        taskArr[front] = null;
        if (front == back){
            front = -1;
            back = -1;
        }else if (front == size-1)
            front = 0;
        else
            front++;

    }

    /**
     * displays all tasks in the queue from “front” to “back”
     */
    public void display(){
            if (back >= front)
            {
                for (int i = front; i <= back; i++)
                    System.out.println(taskArr[i].getDescription().toString());
            }
            else
            {
                for (int i = front; i < size; i++)
                    System.out.println(taskArr[i].getDescription().toString());

                for (int i = 0; i <= back; i++)
                    System.out.println(taskArr[i].getDescription().toString());
            }
        }
}
