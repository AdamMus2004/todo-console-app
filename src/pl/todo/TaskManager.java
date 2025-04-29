package pl.todo;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public void addTask(String description){
        Task task = new Task(nextId++,description,false);
        tasks.add(task);
    }
    public void listTasks(){
        if (tasks.isEmpty()){
            System.out.println("lista jest pusta");
        }
        else {
            for(Task task : tasks){
                System.out.println(task);
            }
        }
    }
}
