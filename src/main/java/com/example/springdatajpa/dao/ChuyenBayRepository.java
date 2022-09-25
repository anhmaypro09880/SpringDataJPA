package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
        @Query(value =  "Select * From ChuyenBay where GaDen like 'DAD'",nativeQuery = true)
        public List<ChuyenBay> getChuyenBayDad();
        //Cau 4
        @Query(value =  "Select * From [dbo].[chuyenbay] where DoDai <10000 and DoDai>  8000",nativeQuery = true)
        public List<ChuyenBay> cau4();
        //Cau 5
        @Query(value =  "Select * From [dbo].[chuyenbay] where GaDi like 'SGN' and GaDen like 'BMV' ",nativeQuery = true)
        public List<ChuyenBay> cau5();
        //Cau6
        @Query(value =  "Select COUNT(*) as countcb from chuyenbay where gadi = 'sgn' ",nativeQuery = true)
        public int cau6();
}
