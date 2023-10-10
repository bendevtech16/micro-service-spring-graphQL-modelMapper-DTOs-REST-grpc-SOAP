package cm.uy1.custumerservice.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import cm.uy1.custumerservice.dto.CustomerRequest;
import cm.uy1.custumerservice.entities.Customer;

@Component
public class CustomerMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public Customer from(CustomerRequest customerRequest) {

        // customer.setName(customerRequest.name());
        // customer.setEmail(customerRequest.email());
        Customer customer1 = modelMapper.map(customerRequest, Customer.class);
        return customer1;
    }

}