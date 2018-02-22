public class Task {
    private String taskDescr;
    private int priority;

    protected void taskDescription (String string){
       taskDescr = string;

    }
    private void priorityTask(int num){
        // A larger number means a higher priority.
        // If different tasks happen to have
        // the same priority, follow the rule “First-Come-First-Serve (FCFS)”.
    }
     public String getDescription(){
       return taskDescr;
    }
    protected void setPriority(int p){
        priority = p;
    }
    public  int getPriority(){
       return priority;
    }
}
