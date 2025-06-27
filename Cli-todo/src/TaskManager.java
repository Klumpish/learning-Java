import java.io.*;
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

    public void saveToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(
          new FileWriter(fileName))) {
            for (Task task : tasks) {
                writer.write(task.toCSV());
                writer.newLine();
            }
            System.out.println("✅ Tasks saved to " + fileName);
        } catch (IOException e) {
            System.out.println(
              "❌ Error saving tasks: " + e.getMessage());
        }
    }

    public void loadFromFile(String fileName) {
        tasks.clear(); //optional: to remove old task first
        try (BufferedReader reader = new BufferedReader(
          new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                tasks.add(Task.fromCSV(line));
            }
            System.out.println("✅ Tasks loaded from " + fileName);
        } catch (IOException e) {
            System.out.println(
              "❌ Error loading tasks: " + e.getMessage());
        }
    }

    public Task getTaskByIndex(int index) {
        if (index >= 0 && index < tasks.size()) {
            return tasks.get(index);
        }
        return null;
    }

}
