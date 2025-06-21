public class Main {
    public static void main(String[] args) {
        // Dependency creation
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Injecting dependency into service
        CustomerService service = new CustomerService(repository);

        // Using service
        service.getCustomerDetails("C001");
    }
}
