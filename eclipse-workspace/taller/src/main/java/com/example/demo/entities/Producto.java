package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Producto {
	@Id
	@Column(nullable=false, length=10)
	 private Integer id;
	@Column (nullable=false, length=20)private String name;
	@Column (nullable=false, length=20)private double price;
}
