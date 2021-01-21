package com.example.demo.data;

import org.springframework.stereotype.Repository;

import com.example.demo.annotations.TrackTime;

@Repository
public class Data1 {
	@TrackTime
	public String retrieveData() {
		return ">>>> data1";
	}
}
