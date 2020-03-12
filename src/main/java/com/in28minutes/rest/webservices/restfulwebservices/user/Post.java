package com.in28minutes.rest.webservices.restfulwebservices.user;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {
	@Id
	@GeneratedValue
	private int id;
	private String desc;
	@ManyToOne(fetch = FetchType.LAZY)
	private MyUsers users;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MyUsers getUsers() {
		return users;
	}

	public void setUsers(MyUsers users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", desc=" + desc + "]";
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
