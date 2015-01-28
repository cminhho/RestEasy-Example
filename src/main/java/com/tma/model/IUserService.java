package com.tma.model;

import java.util.List;
import com.tma.model.User;

public interface IUserService {
	public List<User> getAll();
	public User getWithId(String id);
	public void add(User user);
	public void update(String id, User user);
	public void delete(String id);
}
