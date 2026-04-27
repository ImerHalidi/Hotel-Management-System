package HM4.Class4;

public class Staff {
    private String name;
    private int taskCompleted;

    public Staff(String name){
    this.name=name;

    }

    public void completeTask(){
        taskCompleted++;
    }

    public int getTaskCompleted(){
        return taskCompleted;
    }

    @Override
    public String toString(){
        return name;
    }

}
