package pl.todo;

public class Task {
    int id;
    String description;
    boolean done;

    public Task(int id, String description, boolean done) {
        this.id = id;
        this.description = description;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String toString() {
        return id+". ["+ (done ? "X":" ")+"] "+description;
    }
}
