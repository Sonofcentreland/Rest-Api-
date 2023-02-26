package com.jeeva.repository;

import com.jeeva.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String>{
	User findByusername(String username);
}
