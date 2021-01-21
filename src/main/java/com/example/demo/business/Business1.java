package com.example.demo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.annotations.TrackTime;
import com.example.demo.data.Data1;

@Service
public class Business1 {

	@Autowired
	Data1 data1;
	
	public String getData() {
		return data1.retrieveData();
	}
}
