public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(1, "Robert", "Manager", 70000));
        manager.addEmployee(new Employee(2, "Sagar", "Engineer", 50000));
        manager.addEmployee(new Employee(3, "Mono", "Designer", 45000));

        System.out.println("All Employees:");
        manager.listEmployees();

        System.out.println("\nSearch Employee ID 2:");
        Employee emp = manager.searchEmployee(2);
        System.out.println(emp != null ? emp : "Not found");

        System.out.println("\nDelete Employee ID 2:");
        System.out.println(manager.deleteEmployee(2) ? "Deleted." : "Not found.");

        System.out.println("\nAll Employees After Deletion:");
        manager.listEmployees();
    }
}
