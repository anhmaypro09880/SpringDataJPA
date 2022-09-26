package com.example.springdatajpa.controller;

import java.util.List;

import com.example.springdatajpa.dao.MayBayRepository;
import com.example.springdatajpa.entity.MayBay;
import com.example.springdatajpa.service.MayBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/maybay")
public class MayBayController  {
	@Autowired
	private MayBayService mbService;
	@Autowired
	private MayBayRepository mbRepository;
	
	@GetMapping("/allMb")
	public List<MayBay> getAllMayBay() {
		return mbRepository.findAll();
	}

}
