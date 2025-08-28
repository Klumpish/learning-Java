package clitodo;

import java.util.Scanner;
import java.util.UUID;

public class TaskApp {
    private Scanner scanner;
    private TaskManager manager;

    public TaskApp() {
        scanner = new Scanner(System.in);
        manager = new TaskManager();
    }

    public void run() {
        boolean running = true;

        while (running) {
            System.out.println("\n=== Task Manager ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Save");
            System.out.println("6. Load");
            System.out.println("7. Exit");
            System.out.print("Choose: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1" -> addTask();
                case "2" -> showNumberedTasks();
                case "3" -> completeTask();
                case "4" -> deleteTask();
                case "5" -> manager.saveToFile("tasks.txt");
                case "6" -> manager.loadFromFile("tasks.txt");
                case "7" -> running = false;
                default -> System.out.println("Invalid option.");
            }
        }

        System.out.println("👋 Goodbye!");
    }

    private void addTask() {
        System.out.println("Enter Task description: ");
        String desc = scanner.nextLine();
        manager.addTask(desc);
    }

    private void completeTask() {
        System.out.print("Enter task number to complete: ");
        int num = Integer.parseInt(scanner.nextLine()) - 1;
        Task task = manager.getTaskByIndex(num);
        if (task != null) {
            manager.markTaskComplete(task.getUuid());
            System.out.printf(" Task is now marked as %s.%n",
              task.isCompleted() ? "✅ complete" : "❌ incomplete");
        } else {
            System.out.println("❌ Invalid task number.");
        }
    }

    private void deleteTask() {
        System.out.print("Enter task number to delete: ");
        int num = Integer.parseInt(scanner.nextLine()) - 1;
        Task task = manager.getTaskByIndex(num);
        if (task != null) {
            manager.deleteTask(task.getUuid());
            System.out.println("✅ Task delete.");
        } else {
            System.out.println("❌ Invalid task number.");
        }
    }

    public void showNumberedTasks() {
        var tasks = manager.listTasks();
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            String status = t.isCompleted() ? "[x]" : "[ ]";
            System.out.printf("%d. %s %s%n", i + 1, status,
              t.getDescription());
        }
        System.out.println("Press enter to continue...");
        scanner.nextLine();
    }
}
