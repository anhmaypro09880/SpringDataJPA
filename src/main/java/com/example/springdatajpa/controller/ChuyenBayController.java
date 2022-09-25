package com.example.springdatajpa.controller;

import java.util.List;

import com.example.springdatajpa.entity.ChuyenBay;
import com.example.springdatajpa.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ChuyenBayController {
		@Autowired
		private ChuyenBayService cbService;
		
		@GetMapping("/chuyenbay")
		public List<ChuyenBay> getAllChuyenBay(){
			return cbService.findAll();
		}
}
