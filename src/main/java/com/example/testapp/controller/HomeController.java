/**
* @author suren
 *
*/

package com.example.testapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.testapp.model.User;
import com.example.testapp.service.IUserService;

@Controller
public class HomeController {

	@Autowired
	public IUserService userService;

	@RequestMapping(value = { "/" })
	public String dashboard() {
		return "index";
	}

	@RequestMapping("/hello")
	public @ResponseBody String hello() {
		return "Hello There";
	}

	@RequestMapping("/users") // display all users
	public @ResponseBody String listAllUsers(Model model) {
		List<User> users = userService.listUsers();
		return users.toString();
	}

	@RequestMapping("/user/{id}")
	public @ResponseBody String viewUser(@PathVariable("id") int id) {
		return userService.findById(id).toString();
	}

}
