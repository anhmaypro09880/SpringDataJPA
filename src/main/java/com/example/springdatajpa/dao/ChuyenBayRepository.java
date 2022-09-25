package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
        @Query(value =  "Select * From ChuyenBay where GaDen like 'DAD'",nativeQuery = true)
        public List<ChuyenBay> getChuyenBayDad();
}
