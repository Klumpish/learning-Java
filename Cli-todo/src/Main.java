public class Main {
    public static void main(String[] args) {
        
        TaskManager taskManager = new TaskManager();

        taskManager.addTask("get a burger");
        taskManager.addTask("go to the moon");

        taskManager.markTaskComplete(
          taskManager.listTasks().get(1).getUuid());

        taskManager.getAllTasks();
    }

    public static void getInfo(Task task) {


        System.out.printf(
          "task: %s, id %s, created %s, complete: " + "%s%n",
          task.getDescription(), task.getUuid(),
          task.getCreationDate(), task.isCompleted());

    }
}
