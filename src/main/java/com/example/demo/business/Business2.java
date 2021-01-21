package com.example.demo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.Data2;

@Service
public class Business2 {

	@Autowired
	Data2 data2;
	
	public String getData() {
		return data2.retrieveData();
	}
}
