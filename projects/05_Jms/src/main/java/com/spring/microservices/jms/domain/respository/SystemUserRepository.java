package com.spring.microservices.jms.domain.respository;

import com.spring.microservices.jms.domain.model.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemUserRepository extends JpaRepository<SystemUser, Long>{ }
