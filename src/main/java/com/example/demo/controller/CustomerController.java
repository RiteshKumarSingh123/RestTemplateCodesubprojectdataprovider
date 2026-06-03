package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CustomerRanger;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("cus")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("/saveCustomer")
	public CustomerRanger saveCustomerData(@RequestBody CustomerRanger cutomer) {
		return service.saveCustomerData(cutomer);
	}
	
	@GetMapping("/customerList")
	public List<CustomerRanger>  getCustomerRangeList(){
		return service.getCustomerRangerList();
	}
	
	@GetMapping("/getCustomerById")
	public CustomerRanger getCustomerRangerdataById(@RequestParam int id) {
		return service.getCustomerRangerdataById(id);
	}
	
	@DeleteMapping("/deleteCustomerById")
	public void deleteCustomerRangeById(@RequestParam int id) {
		 service.deleteCustomerRangeById(id);
	}
	
	@PutMapping("/updateCustomerRange")
	public CustomerRanger updateCustomerRange(@RequestBody CustomerRanger customerRanger) {
		return service.updateCustomerRange(customerRanger);
	}

}
