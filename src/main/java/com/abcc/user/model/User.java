package com.abcc.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "user")
public class User {

	@Id
	@GeneratedValue(generator = "UUID")
	@Column(name="id")
	private String id;
	
	@Column(name="userName")
	private String userName;
	
}
