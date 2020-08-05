/* 
 * Author ::. Sivateja Kandula | www.java4s.com 
 *
 */

package com.demo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.app.repository.SpringJava4sDAO;
import com.java4s.model.Customer;

@RestController
public class SpringJava4sController {
	
	@Autowired
	public SpringJava4sDAO dao;
	
	@RequestMapping("/getcustInfo")
	public List<Customer> customerInformation() 
	{
		List<Customer> customers = dao.isData();		 
		return customers;
	}
	@RequestMapping("/save")
	public List<Customer> saveCustomerInformation() 
	{
		List<Customer> customers = dao.isData();		 
		return customers;
	}
	
	@RequestMapping("/testSecondDatasource")
	public String dSverify() 
	{
		return dao.dsVerification();		 
	}
}

//URL: http://localhost:8092/springbootds/getcustInfo