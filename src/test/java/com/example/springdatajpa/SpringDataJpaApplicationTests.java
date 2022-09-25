package com.example.springdatajpa;

import com.example.springdatajpa.dao.*;
import com.example.springdatajpa.entity.ChuyenBay;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringDataJpaApplicationTests {
    @Autowired
    ChuyenBayRepository cbRepository;
    @Test
    void contextLoads() {
        List<ChuyenBay> list = cbRepository.getChuyenBayDad();
        list.forEach(e->{
            System.out.println(e.toString());
        });
    }

}
