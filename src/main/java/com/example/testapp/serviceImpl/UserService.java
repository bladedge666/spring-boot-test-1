/**
* @author suren
 *
*/
package com.example.testapp.serviceImpl;

import java.util.List;

import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testapp.model.User;
import com.example.testapp.repository.UserRepository;
import com.example.testapp.service.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	ServletContext servletContext;


	@Override
	public List<User> listUsers() {
		return (List<User>) userRepository.findAll();
	}
	
	@Override
	public void save(User user) {
		userRepository.save(user);
	}

	@Override
	public User findById(int id) {
		return userRepository.findOne(id);
	}

	@Override
	public void removeById(int id) {
		userRepository.removeById(id);
	}

	@Override
	public void update(User user) {
		userRepository.saveAndFlush(user);
	}

}
