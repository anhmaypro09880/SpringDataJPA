package com.example.springdatajpa.service;

import java.util.List;

import com.example.springdatajpa.dao.MayBayRepository;
import com.example.springdatajpa.entity.MayBay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MayBayServiceImpl implements MayBayService {
		@Autowired
		private MayBayRepository mbService;

		@Override
		public List<MayBay> findAll() {
			// TODO Auto-generated method stub
			return mbService.findAll();
		}
		
		
}
