package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NhanVienRepository extends JpaRepository<NhanVien,Integer> {
        @Query(value = "Select * From NhanVien where Luong <10000",nativeQuery = true)
        public List<NhanVien> getNVLuongDuoi10k();
        //Cau 8
        @Query(value = "Select SUM(Luong) as TongLuong From nhanvien",nativeQuery = true)
        public Double cau8();
        //Cau 9
        @Query(value = "Select nv.MaNV From [dbo].[nhanvien] nv join [dbo].[chungnhan] cn on nv.MaNV = cn.MaNV join [dbo].[maybay] mb on cn.MaMB = mb.MaMB\n" +
                "where mb.Loai like 'Boeing%'",nativeQuery = true)
        public List<String> cau9();
        @Query(value = "Select * From [dbo].[nhanvien] nv join [dbo].[chungnhan] cn on nv.MaNV = cn.MaNV join [dbo].[maybay] mb on cn.MaMB = mb.MaMB\n" +
                "where mb.Loai like '%747%'",nativeQuery = true)
        public List<NhanVien> cau10();
}
