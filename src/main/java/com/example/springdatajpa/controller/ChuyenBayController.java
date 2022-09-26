package com.example.springdatajpa.controller;

import java.util.List;

import com.example.springdatajpa.dao.ChuyenBayRepository;
import com.example.springdatajpa.dao.MayBayRepository;
import com.example.springdatajpa.entity.ChuyenBay;
import com.example.springdatajpa.entity.MayBay;
import com.example.springdatajpa.service.ChuyenBayService;
import com.example.springdatajpa.service.MayBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ChuyenBayController {
		@Autowired
		private ChuyenBayService cbService;
		@Autowired
		private MayBayService mbService;
		@Autowired
		private ChuyenBayRepository cbRepository;
		@Autowired
		private MayBayRepository mbRepository;

		
		@GetMapping("/chuyenbay")
		public List<ChuyenBay> getAllChuyenBay(){
			return cbRepository.findAll();
		}

		@GetMapping("/maybay")
		public List<MayBay> getAllMayBay() {
			return mbService.findAll();
		}
		@GetMapping("/cbBe10000andLon8000")
		public List<ChuyenBay> cbBe10000andLon8000(){
			return cbRepository.cau4();
		}
	//
}
