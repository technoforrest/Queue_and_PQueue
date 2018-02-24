/**
 * This program takes input from userr and places it in a queue or priority queue
 * CPSC 224-01, Spring 2018
 * Programming Assignment #4
 *
 * @author Danielle Forrest
 * @version v1.0 2/23/18
 */

public class Task {
    private String taskDescr;
    private int priority;

    /**
     * sets value of task description
     *
     * @param string contains task description determined by user input in QueueTest
     */
    protected void taskDescription(String string) {
        taskDescr = string;

    }

    /**
     * @return returns  task description
     */
    public String getDescription() {
        return taskDescr;
    }

    /**
     * sets the priority for the task
     *
     * @param p the priority number of the tasks
     */
    protected void setPriority(int p) {
        priority = p;
    }

    /**
     * @return returns the priority of the task
     */
    public int getPriority() {
        return priority;
    }
}
