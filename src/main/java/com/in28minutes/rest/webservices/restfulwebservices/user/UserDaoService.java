package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<MyUsers> users = new ArrayList<>();

	private static int usersCount = 3;

	static {
		users.add(new MyUsers(1, "Adam", new Date()));
		users.add(new MyUsers(2, "Eve", new Date()));
		users.add(new MyUsers(3, "Jack", new Date()));
	}

	public List<MyUsers> findAll() {
		return users;
	}

	public MyUsers save(MyUsers user) {
		if (user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}

	public MyUsers findOne(int id) {
		for (MyUsers user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	public MyUsers deleteById(int id) {
		Iterator<MyUsers> iterator = users.iterator();
		while (iterator.hasNext()) {
			MyUsers user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}

}
