package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CustomerRanger;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository  repo;
	
	public CustomerRanger saveCustomerData(CustomerRanger customer) {
		return repo.save(customer);
	}
	
	public List<CustomerRanger> getCustomerRangerList(){
		return repo.findAll();
	}
	
	public  CustomerRanger   getCustomerRangerdataById(int id) {
		return repo.findById(id).get();
	}
	
	public void deleteCustomerRangeById(int id) {
		repo.deleteById(id);
	}
	
	public CustomerRanger updateCustomerRange(CustomerRanger customerRanger) {
		return repo.save(customerRanger);
	}

}
