package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.ChuyenBay;
import com.example.springdatajpa.entity.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface MayBayRepository extends JpaRepository<MayBay, Integer> {
//        Cau 2
        @Query(value =  "Select * From MayBay where TamBay <10000",nativeQuery = true)
        public List<MayBay> getMayBayDuoi10km();
        //Cau 7
        @Query(value =  "Select COUNT(*) as loaiMb from maybay where Loai like 'Boeing%'",nativeQuery = true)
        public int cau7();
}
