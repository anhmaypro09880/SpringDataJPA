package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NhanVienRepository extends JpaRepository<NhanVien,Integer> {
        @Query(value = "Select * From NhanVien where Luong <10000",nativeQuery = true)
        public List<NhanVien> getNVLuongDuoi10k();
}
