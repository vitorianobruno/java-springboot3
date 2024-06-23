package com.spring.microservices.jpa;

import com.spring.microservices.jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

	User findById(long id);
	
	List<User> findByName(String name);
	
	@Query("select p from User p where p.name = :name")
	List<User> findByNameName(@Param("name") String name);
	
}
