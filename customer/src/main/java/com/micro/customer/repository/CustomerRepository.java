package com.micro.customer.repository;


import com.micro.customer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface CustomerRepository  extends JpaRepository<Customer, Long> {
}
