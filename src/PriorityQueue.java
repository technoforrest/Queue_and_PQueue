
public class PriorityQueue extends Queue {
    private final Task[] pTaskArr;
    private int index;


    PriorityQueue(){
        pTaskArr= new Task[super.getMaxSize()];
        index = 0;

    }
    @Override
    public void enqueue(Task newTask) {
        Task tempTask = new Task();
        if (super.isFull()) {
            System.out.println("PQueue is full!");
        }
        if(super.isEmpty() ){
            pTaskArr[0] = newTask;
            index++;
        }else{

            for (int i = 0; i < super.getMaxSize(); i++)
            {
                for (int j = i + 1; j < super.getMaxSize(); j++)
                {
                    if (pTaskArr[i].getPriority() < pTaskArr[j].getPriority())
                    {
                        tempTask = pTaskArr[i];
                        pTaskArr[i] = pTaskArr[j];
                        pTaskArr[j] = tempTask;
                    }
                }
            }
            index++;

        }


    }

    @Override
    public void display() {


    }
}
