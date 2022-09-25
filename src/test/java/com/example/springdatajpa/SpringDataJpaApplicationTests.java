package com.example.springdatajpa;

import com.example.springdatajpa.dao.*;
import com.example.springdatajpa.entity.ChuyenBay;

import com.example.springdatajpa.entity.MayBay;
import com.example.springdatajpa.entity.NhanVien;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringDataJpaApplicationTests {
    @Autowired
    ChuyenBayRepository cbRepository;
    @Autowired
    MayBayRepository mbRepository;
    @Autowired
    NhanVienRepository nvRepository;
    @Test
    void cau1() {
        List<ChuyenBay> list = cbRepository.getChuyenBayDad();
        list.forEach(e->{
            System.out.println(e.toString());
        });
    }
    @Test
    void cau2() {
        List<MayBay> list = mbRepository.getMayBayDuoi10km();
        list.forEach(e->{
            System.out.println(e.toString());
        });
    }
    @Test
    void cau3() {
        List<NhanVien> list = nvRepository.getNVLuongDuoi10k();
        list.forEach(e->{
            System.out.println(e.getTen());
        });
    }
    @Test
    void cau4() {
        List<ChuyenBay> list = cbRepository.cau4();
        list.forEach(e->{
            System.out.println(e);
        });
    }
    @Test
    void cau5() {
        List<ChuyenBay> list = cbRepository.cau5();
        list.forEach(e->{
            System.out.println(e);
        });
    }
    @Test
    void cau6() {
        int list = cbRepository.cau6();
        System.out.println("So chuyen bay :"+list);
    }
    @Test
    void cau7() {
        int list = mbRepository.cau7();
        System.out.println("So may bay Boeing :"+list);
    }

}
