package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("veri tabanına kaydedildi " + customer.getFirstName());
    }
}
