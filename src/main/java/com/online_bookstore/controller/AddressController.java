package com.online_bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.online_bookstore.service.AddressService;
@Controller
@RequestMapping("/")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@RequestMapping("/get")
	@ResponseBody
	public String Test(){
		System.out.println(addressService.getAllAddress().size());
		System.out.println("asd");
		return "asdasdasd";
	}
	
	
	
	

}
