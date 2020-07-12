package com.example.kakeibo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="category")
public class Category {

	@Getter
	@Setter
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "category_id")
	/* id */
	private int categryId;
	
	@Getter
	@Setter
	@Column(name = "category_name")
	/* ユーザー名 */
	private String categryName;
	
}
