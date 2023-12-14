package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Proveedor {
	@Id
	@Column(nullable=false, length=10)
	private Long id;
	@Column (nullable=false, length=20)String companyName;
	@Column (nullable=false, length=20)String contactName;
}
