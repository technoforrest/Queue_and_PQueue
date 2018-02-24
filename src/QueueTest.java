/**
 * This program takes input from userr and places it in a queue or priority queue
 * CPSC 224-01, Spring 2018
 * Programming Assignment #4
 *
 * @author Danielle Forrest
 * @version v1.0 2/23/18
 */

import java.util.Scanner;

public class QueueTest {

    public static void main(String[] args) {
        /*Finally, in your test file, you will build up a Queue and a PriorityQueue. You may ask users to
        input the task description and task priority. You need provide plenty of tests. For example,
        special cases for “enqueue” (when a queue is full) or “dequeue” (when a queue is empty). */
        Queue queue = new Queue(3);
        PriorityQueue pQueue = new PriorityQueue(3);
        Task task;
        Scanner scanner = new Scanner(System.in);
        //recieve input from user and place in queue
        while (!queue.isFull()) {
            task = new Task();
            System.out.println("Please input a task.");
            task.taskDescription(scanner.next());

            System.out.println("Please input a priority.");
            task.setPriority(scanner.nextInt());
            queue.enqueue(task);
            pQueue.enqueue(task);

        }
        System.out.println("Elements in Queue are: ");
        queue.display();
        System.out.println("Elements after Queue dequeue are: ");
        queue.dequeue();
        queue.display();
        task = new Task();
        System.out.println("Please input a task.");
        task.taskDescription(scanner.next());
        System.out.println("Please input a priority.");
        task.setPriority(scanner.nextInt());
        queue.enqueue(task);
        System.out.println("Elements in Queue2 are: ");
        queue.display();
        System.out.println("Elements in PQueue are: ");
        pQueue.display();
        System.out.println("Elements after PQueue dequeue are: ");
        pQueue.dequeue();
        pQueue.display();
        System.out.println("Elements in PQueue2 are: ");
        pQueue.enqueue(task);
        pQueue.display();


    }
}
