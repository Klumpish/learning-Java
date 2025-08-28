package clitodo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskDatabase db = new TaskDatabase();
        List<Task> all = db.loadAllTasks();
        for (Task t : all) {
            System.out.println(t);
        }
//        TaskApp app = new TaskApp();
//        app.run();

//        TaskManager taskManager = new TaskManager();
//
//        taskManager.addTask("get a burger");
//        taskManager.addTask("go to the moon");
//
//        taskManager.markTaskComplete(
//          taskManager.listTasks().get(1).getUuid());
//
//        taskManager.getAllTasks();
//        Task original = new Task("Eat burger with cheese");
//        original.markComplete();
//
//        System.out.println("📝 Original Task:");
//        System.out.println(original);
//
//        // Convert to CSV
//        String csv = original.toCSV();
//        System.out.println("\n📄 CSV Format:");
//        System.out.println(csv);
//
//        // Convert back from CSV
//        Task loaded = Task.fromCSV(csv);
//
//        System.out.println("\n🔁 Loaded from CSV:");
//        System.out.println(loaded);
//
//        taskManager.saveToFile("Tasks.txt");
//        taskManager.loadFromFile("Tasks.txt");
//        taskManager.getAllTasks();
    }


    public static void getInfo(Task task) {


        System.out.printf(
          "task: %s, id %s, created %s, complete: " + "%s%n",
          task.getDescription(), task.getUuid(),
          task.getCreationDate(), task.isCompleted());

    }
}
