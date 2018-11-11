package swiki.mainapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import swiki.mainapplication.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
