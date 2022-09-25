package com.example.springdatajpa.service;

import java.util.List;

import com.example.springdatajpa.dao.ChuyenBayRepository;
import com.example.springdatajpa.entity.ChuyenBay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ChuyenBayServiceImpl implements ChuyenBayService {
	@Autowired 
	private ChuyenBayRepository cbDao;
	@Override
	public List<ChuyenBay> findAll() {
		// TODO Auto-generated method stub
		return cbDao.findAll();
	}
		
}
