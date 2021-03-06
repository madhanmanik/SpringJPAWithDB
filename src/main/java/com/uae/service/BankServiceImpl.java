package com.uae.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uae.model.Customer;

@Service
public class BankServiceImpl {

	   @Autowired
	    private BankRepository bankRepository;

	    public List<String> getAllDetails() {
	        List<String> result = new ArrayList<String>();
	      //  List<Customer> players = bankRepository.findAll();
	        Customer value =  bankRepository.findById(1);
	        System.out.println("----->" +value);
	        for (Customer player : bankRepository.findAll()) {
	            result.add(player.getName());
	        }
	        return result;
	    }
	    
}
