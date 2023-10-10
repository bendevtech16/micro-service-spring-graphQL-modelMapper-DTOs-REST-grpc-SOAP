package cm.uy1.custumerservice.web;

import java.util.List;

import org.springframework.stereotype.Component;

import cm.uy1.custumerservice.dto.CustomerRequest;
import cm.uy1.custumerservice.entities.Customer;
import cm.uy1.custumerservice.mapper.CustomerMapper;
import cm.uy1.custumerservice.repository.CustomerRepository;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
@WebService(serviceName = "CustomerWS")
public class CustomerSoapService {
    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    @WebMethod
    public List<Customer> allCustomers() {
        return customerRepository.findAll();
    }

    @WebMethod
    public Customer getCustomerById(@WebParam(name = "id") Long id) {
        return customerRepository.findById(id).get();
    }

    @WebMethod
    public Customer saveCustomer(@WebParam CustomerRequest customerRequest) {
        Customer customer = customerMapper.from(customerRequest);
        return customerRepository.save(customer);
    }

}
