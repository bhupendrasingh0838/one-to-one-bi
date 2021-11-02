package mapping.onetoonebi.Controller;

import mapping.onetoonebi.Entity.Customer;
import mapping.onetoonebi.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/getAll")
    public List<Customer> getAll(){
        return customerService.getAll();
    }
    @GetMapping("/getById/{id}")
    public Customer getById(@PathVariable int id){
        return customerService.getById(id);
    }
    @PostMapping("/create")
    public String create(@RequestBody Customer customer){
        customerService.create(customer);
        return "Data Created";
    }
    @DeleteMapping("delete/{id}")
    public String  delete(@PathVariable int id){
        customerService.delete(id);
        return "Delete item";
    }
    @PutMapping("/update/{id}")
    public Customer update(@PathVariable int id, @RequestBody Customer customer){
        customerService.update(id, customer);
        return customer;
    }
}
