public class CustomerService {
    private CustomerRepository customerRepository;

    // Constructor-based injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void getCustomerDetails(String id) {
        Customer customer = customerRepository.findCustomerById(id);
        customer.displayInfo();
    }
}
