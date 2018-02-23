
public class PriorityQueue extends Queue {
    private final Task[] pTaskArr;
    private final int maxSize;
    private int front;
    private int count;



    PriorityQueue(int s) {
        super(s);
        maxSize = s;
        pTaskArr = super.taskArr;
        front = super.front;
        count = super.count;

    }
    @Override
    public void enqueue(Task newTask) {
        if (count == maxSize) {
            System.out.println("PQueue is full!");
            return;
        }
        if (count == 0) {// Insert First Element
            front++;
            pTaskArr[front] = newTask;
            count++;
        } else {
            int i;
            for (i = count - 1; i >= 0; i--) {
                if (newTask.getPriority() > pTaskArr[i].getPriority())
                    pTaskArr[i + 1] = pTaskArr[i];
                else
                    break;
            }
            pTaskArr[i + 1] = newTask;
            count++;
        }
    }
    @Override
    public void dequeue()
    {
        if(super.isEmpty()){
            System.out.println("PQueue is empty");
        }
        pTaskArr[count - 1] = null;
        front++;
        count--;
    }
    @Override
    public void display() {
        for (int i = 0 ; i < count ; i++){
            System.out.println(pTaskArr[i].getDescription() + " " + pTaskArr[i].getPriority());
        }
    }
}