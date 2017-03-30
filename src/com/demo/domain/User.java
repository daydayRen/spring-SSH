package com.demo.domain;

import java.util.Date;

public class User {
	private int id;
	private String name;
	private String password;
	private String type;
	private Byte image;
	private String email;
	private String gender;
	private Date birthday;
	private String address;
	private String job;
	private String synopsis;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String password, String type, Byte image, String email,
			String gender, Date birthday, String address, String job, String synopsis) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.type = type;
		this.image = image;
		this.email = email;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.job = job;
		this.synopsis = synopsis;
	}
	
	
	public Byte getImage() {
		return image;
	}

	public void setImage(Byte image) {
		this.image = image;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
