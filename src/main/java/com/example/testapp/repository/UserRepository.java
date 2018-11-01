/**
* @author suren
 *
*/
package com.example.testapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.testapp.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	public User saveAndFlush(User user);

	@Query("delete from User u where u.id = :id")
	public void removeById(Integer id);

}
