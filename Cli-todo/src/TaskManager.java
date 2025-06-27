import java.util.ArrayList;
import java.util.UUID;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);
    }

    public ArrayList<Task> listTasks() {
        return tasks;
    }

    public boolean markTaskComplete(UUID uuid) {
        for (Task task : tasks) {
            if (task.getUuid().equals(uuid)) {
                task.markComplete();
                return true;
            }
        }
        return false;
    }

    public boolean deleteTask(UUID uuid) {

        return tasks.removeIf(task -> task.getUuid().equals(uuid));

    }

    public void getAllTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
