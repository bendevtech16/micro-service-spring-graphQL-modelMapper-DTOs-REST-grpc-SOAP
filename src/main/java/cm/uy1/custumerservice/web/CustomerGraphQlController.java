package cm.uy1.custumerservice.web;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import cm.uy1.custumerservice.dto.CustomerRequest;
import cm.uy1.custumerservice.entities.Customer;
import cm.uy1.custumerservice.mapper.CustomerMapper;
import cm.uy1.custumerservice.repository.CustomerRepository;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class CustomerGraphQlController {

    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    @QueryMapping
    public List<Customer> allCustomers() {
        return customerRepository.findAll();
    }

    @QueryMapping
    public Customer getCustomerById(@Argument Long id) {
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer == null)
            throw new RuntimeException(String.format("Customer %s not found", id));
        return customer;

    }

    @MutationMapping
    public Customer saveCustomer(@Argument CustomerRequest customer) {
        Customer c = customerMapper.from(customer);
        return customerRepository.save(c);
    }

}