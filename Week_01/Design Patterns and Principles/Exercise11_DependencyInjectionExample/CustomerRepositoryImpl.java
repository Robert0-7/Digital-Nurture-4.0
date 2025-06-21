public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public Customer findCustomerById(String id) {
        // Simulate fetching from database
        return new Customer(id, "Robert Satyam D Cruze", "robertdcruze07@gmail.com");
    }
}
