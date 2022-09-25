package com.example.springdatajpa.controller;

import java.util.List;

import com.example.springdatajpa.entity.MayBay;
import com.example.springdatajpa.service.MayBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api")
public class MayBayController  {
	@Autowired
	private MayBayService mbService;
	
	@GetMapping("/maybay")
	public List<MayBay> getAllMayBay() {
		return mbService.findAll();
	}
}
