package pl.todo;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask("Nauczyć się Javy");
        manager.addTask("Zrobić TODO App");
        manager.addTask("Zjeść obiad");

        manager.listTasks();
    }
}
