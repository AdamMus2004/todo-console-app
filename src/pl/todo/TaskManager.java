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
    public void markTaskAsDone(int id){
        for(Task task : tasks){
            if (task.getId()==id){
                task.setDone(true);
                System.out.println("Zadanie od id: "+id+" zostało wykonane.");
                return;
            }
        }
        System.out.println("Nie znaleziono zadania o ID: " + id);
    }
}
