import java.time.LocalDate;
import java.util.UUID;

public class Task {
    private String description;
    protected boolean isCompleted;
    private UUID uuid;
    private LocalDate creationDate;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
        this.uuid = UUID.randomUUID();
        this.creationDate = LocalDate.now();
    }

    public Task(String description, UUID uuid, LocalDate creationDate,
                boolean isCompleted) {
        this.description = description;
        this.uuid = uuid;
        this.creationDate = creationDate;
        this.isCompleted = isCompleted;
    }


    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public UUID getUuid() {
        return uuid;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void markComplete() {
        this.isCompleted = !isCompleted;

    }


    public String toString() {
        return "Task: " + "description='" + description + '\'' +
          ", isCompleted=" + isCompleted + ", uuid=" + uuid +
          ", creationDate=" + creationDate + '}';
    }

    public String toCSV() {
        return uuid.toString() + "," + "\"" +
          description.replace("\"", "\"\"") + "\"," + isCompleted +
          "," + creationDate;
    }

    public static Task fromCSV(String csvline) {
        String[] parts = csvline.split(",", 4);

        UUID uuid = UUID.fromString(parts[0]);
        String description = parts[1].replace("^\"|\"$", "")
                                     .replace("\"\"", "\"");
        boolean isCompleted = Boolean.parseBoolean(parts[2]);
        LocalDate creationDate = LocalDate.parse(parts[3]);


        Task task = new Task(description);
        task.uuid = uuid;
        task.creationDate = creationDate;
        task.isCompleted = isCompleted;

        return task;
    }
}
