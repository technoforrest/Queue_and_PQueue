import java.util.ArrayList;
import java.util.Scanner;

public class QueueTest {

    public static void main(String[] args) {
        /*Finally, in your test file, you will build up a Queue and a PriorityQueue. You may ask users to
        input the task description and task priority. You need provide plenty of tests. For example,
        special cases for “enqueue” (when a queue is full) or “dequeue” (when a queue is empty). */
        Queue queue = new Queue(3);
        PriorityQueue pQueue = new PriorityQueue();
        int count = 0;
        Task task;
        Scanner scanner = new Scanner(System.in);

        while (!queue.isFull()) {
            task = new Task();
            System.out.println("Please input a task.");
            task.taskDescription(scanner.next());
            //System.out.println("Please input a priority.");
            //task.setPriority(scanner.nextInt());
            queue.enqueue(task);
            count++;
        }
        System.out.println("Elements in queue are: ");
        queue.display();
        System.out.println("Elements after dequeue are: ");
        queue.dequeue();
        queue.display();



    }
}
