/**
* @author suren
 *
*/
package com.example.testapp.service;

import java.util.List;

import com.example.testapp.model.User;

public interface IUserService {

	public List<User> listUsers();
	public void save(User user); //Post
	public User findById(int id); // GET
	public void update(User user);
	public void removeById(int id);
}
