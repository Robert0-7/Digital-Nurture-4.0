public class EmployeeManager {
    private Employee[] employees;
    private int count;

    public EmployeeManager(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Add employee
    public boolean addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
            return true;
        }
        return false; // array is full
    }

    // Search employee by ID
    public Employee searchEmployee(int empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == empId) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse all employees
    public void listEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete employee by ID
    public boolean deleteEmployee(int empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == empId) {
                // Shift elements left
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                return true;
            }
        }
        return false;
    }
}
