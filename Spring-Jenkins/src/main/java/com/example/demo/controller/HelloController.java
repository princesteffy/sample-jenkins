package com.example.demo.controller;

//import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.bean.Customer;

@RestController
public class HelloController {
	
	@GetMapping("/helloWorld")
	public String helloWorld()
	{
		return "Hello World";
	}
	
	/*
	 * @RequestMapping(value="/details", method=RequestMethod.GET,
	 * produces=MediaType.APPLICATION_XML)
	 * 
	 * @ResponseBody public Customer details() { Customer customer = new Customer();
	 * customer.setId(2029); customer.setName("Prince");
	 * customer.setAddress("Tamil nadu"); return customer; }
	 */

}
