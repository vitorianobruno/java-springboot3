package com.spring.microservices.rest.model;

import jakarta.annotation.Nonnull;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Nonnull
    public List<User> findAll();

    public List<User> findByName(String name);

    public User findById(long id);

}
