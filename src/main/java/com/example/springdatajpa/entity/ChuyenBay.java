package com.example.springdatajpa.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "chuyenbay")
public class ChuyenBay implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String MaCB;
	@Column(name = "Gadi")
	private String gaDi;
	@Column(name = "Gaden")
	private String gaDen;
	@Column(name = "Dodai")
	private int doDai;
	@Column(name = "Giodi")
	private Date gioDi;
	@Column(name = "Gioden")
	private Date gioDen;
	@Column(name = "Chiphi")
	private int chiPhi;

	
	

}
