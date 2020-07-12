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
@Table(name="user")
public class User {

	@Getter
	@Setter
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
	/* id */
	private int id;
	@Getter
	@Setter
	/* ユーザー名 */
	private String userName;
	@Getter
	@Setter
	/* メールアドレス */
	private String email;
	@Getter
	@Setter
	/* パスワード */
	private String password;
	
	
}
