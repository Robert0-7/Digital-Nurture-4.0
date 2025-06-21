public class MVCTest {
    public static void main(String[] args) {
        // Create model
        Student student = new Student("Alice", "S101", "A");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Display initial data
        controller.updateView();

        // Update model via controller
        controller.setStudentName("Bob");
        controller.setStudentGrade("B+");

        // Display updated data
        controller.updateView();
    }
}
