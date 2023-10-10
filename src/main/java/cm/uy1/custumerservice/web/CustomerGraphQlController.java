package cm.uy1.custumerservice.web;

import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import cm.uy1.custumerservice.entities.Customer;
import cm.uy1.custumerservice.repository.CustomerRepository;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class CustomerGraphQlController {

    private CustomerRepository customerRepository;

    @QueryMapping
    public List<Customer> allCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        Customer customer = customerRepository.findById(id).get();
        if (customer == null)
            throw new RuntimeException(String.format("Customer %s% not found", id));
        return customer;

    }

}