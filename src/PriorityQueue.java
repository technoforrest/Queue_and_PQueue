/**
 * This program takes input from userr and places it in a queue or priority queue
 * CPSC 224-01, Spring 2018
 * Programming Assignment #4
 *
 * @author Danielle Forrest
 * @version v1.0 2/23/18
 */

public class PriorityQueue extends Queue {
    private final int maxSize;

    /**
     * Parameter constructor
     *
     * @param s is the size of the queue determined in QueueTest
     */
    PriorityQueue(int s) {
        super(s);
        maxSize = s;
    }

    /**
     * Places task in priority queue based on priority. Higher number has more priority
     *
     * @param newTask is the name and priority determined by user in QueueTest
     */
    @Override
    public void enqueue(Task newTask) {
        if (super.isFull()) {
            System.out.println("PQueue is full!");
            return;
        }

        if (count == 0) {// Insert First Element
            super.front = 0;
            super.taskArr[super.front] = newTask;
            super.count++;
        } else {
            int i;
            for (i = super.count - 1; i >= 0; i--) {
                if (newTask.getPriority() > super.taskArr[i].getPriority()) {
                    super.taskArr[i + 1] = super.taskArr[i];
                } else
                    break;
            }
            super.taskArr[i + 1] = newTask;
            super.front++;
            super.count++;
        }
    }

    /**
     * removes item from front of priority queue.
     */
    @Override
    public void dequeue() {
        if (super.isEmpty()) {
            System.out.println("PQueue is empty");
        }
        super.taskArr[super.front] = null;
        super.front--;
        super.count--;

    }

    /**
     * displays priority queue
     */
    @Override
    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.println(super.taskArr[i].getDescription() + " " + super.taskArr[i].getPriority());
        }
    }


}