package mapping.onetoonebi.Service;

import mapping.onetoonebi.Entity.Customer;
import mapping.onetoonebi.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public List<Customer> getAll(){
        return (List<Customer>) customerRepository.findAll();
    }
    public Customer getById(int id){
        return customerRepository.findById(id).get();
    }
    public void create(Customer customer){
        customerRepository.save(customer);
    }
    public void delete(int id){
        customerRepository.deleteById(id);
    }
    public Customer update(int id, Customer customer){
        Customer customer1=customerRepository.findById(id).get();
        customer1.setName(customer.getName());
        customer1.setMobNumber(customer.getMobNumber());
        customer1.setAddress(customer.getAddress());
        customerRepository.save(customer1);
        return customer1;
    }
}
