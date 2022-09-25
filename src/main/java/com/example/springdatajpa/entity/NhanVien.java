package com.example.springdatajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "nhanvien")
public class NhanVien {
	@Id
	private String MaNV;
	@Column(name = "Ten")
	private String Ten;
	@Column(name = "Luong")
	private int Luong;
//		@OneToMany(mappedBy = "MaNV")
	@ManyToMany()
	@JoinTable(
			name = "chuyenbay", 
			joinColumns = @JoinColumn(name = "MaNV"),
			 
			inverseJoinColumns = @JoinColumn(name = "MaMB"))
	private List<MayBay> mayBays;

	

}
