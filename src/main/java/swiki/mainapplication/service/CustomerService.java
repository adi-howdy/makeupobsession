package swiki.mainapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import swiki.mainapplication.model.Customer;
import swiki.mainapplication.repository.CustomerRepository;

@Service("customerService")
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer saveCustomer(Customer customer){
		System.out.println("from service page : " + customer.getEmail() + "\n");
		return customerRepository.save(customer);
	}
	
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
	public Customer findOne(Integer id){
		return customerRepository.findById(id).orElse(null);
	}
}
