package com.spring.microservices.jms;

import com.spring.microservices.jms.domain.model.SystemUser;
import com.spring.microservices.jms.domain.respository.SystemUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class JmsReceiver {

	public static final String Q_ONE = "Q_One";

	@Autowired
	private SystemUserRepository repository;

	@JmsListener(destination = JmsReceiver.Q_ONE)
	public void receive(@Payload SystemUser user) {
		repository.save(user);
	}
}
