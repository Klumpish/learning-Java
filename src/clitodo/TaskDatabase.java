package clitodo;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskDatabase {
    private static final String DB_URL = "jdbc:sqlite:tasks.db";

    public TaskDatabase() {
        createTableIfNotExists();
    }

    private void createTableIfNotExists() {
        String sql = "CREATE TABLE IF NOT EXISTS tasks (" +
          "uuid TEXT PRIMARY KEY, " + "description TEXT NOT NULL, " +
          "is_completed INTEGER NOT NULL, " +
          "creation_date TEXT NOT NULL);";


        try (Connection conn = DriverManager.getConnection(
          DB_URL); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("✅ Tasks table is ready.");

        } catch (SQLException e) {
            System.out.println(
              "❌ Error setting up table: " + e.getMessage());
        }


    }

    public void saveTask(Task task) {
        String sql = "INSERT INTO tasks (uuid, description, is_completed, creation_date) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(
          DB_URL); PreparedStatement stmt = conn.prepareStatement(
          sql)) {

            stmt.setString(1, task.getUuid().toString());
            stmt.setString(2, task.getDescription());
            stmt.setInt(3, task.isCompleted() ? 1 : 0);
            stmt.setString(4, task.getCreationDate().toString());

            stmt.executeUpdate();
            System.out.println("💾 Task saved to database.");

        } catch (SQLException e) {
            System.out.println(
              "❌ Failed to save task: " + e.getMessage());
        }
    }

    public List<Task> loadAllTasks() {
        List<Task> tasks = new ArrayList<>();
        String sql = "SELECT * FROM tasks";

        try (Connection conn = DriverManager.getConnection(
          DB_URL); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(
          sql)) {

            while (rs.next()) {
                String uuidStr = rs.getString("uuid");
                String desc = rs.getString("description");
                boolean isDone = rs.getInt("is_completed") == 1;
                LocalDate date = LocalDate.parse(
                  rs.getString("creation_date"));

                Task task = new Task(desc, UUID.fromString(uuidStr),
                  date, isDone);
                tasks.add(task);
            }

            System.out.println(
              "📦 Loaded " + tasks.size() + " tasks from DB.");

        } catch (Exception e) {
            System.out.println(
              "❌ Failed to load tasks: " + e.getMessage());
        }

        return tasks;
    }

}
