package cm.uy1.custumerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cm.uy1.custumerservice.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}