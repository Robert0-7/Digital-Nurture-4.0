public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Setup Database", "In Progress"));
        manager.addTask(new Task(3, "Write API", "Pending"));

        System.out.println("All Tasks:");
        manager.displayTasks();

        System.out.println("\nSearch for Task ID 2:");
        Task found = manager.searchTask(2);
        System.out.println(found != null ? found : "Task not found");

        System.out.println("\nDelete Task ID 2:");
        System.out.println(manager.deleteTask(2) ? "Deleted successfully" : "Not found");

        System.out.println("\nAll Tasks After Deletion:");
        manager.displayTasks();
    }
}
