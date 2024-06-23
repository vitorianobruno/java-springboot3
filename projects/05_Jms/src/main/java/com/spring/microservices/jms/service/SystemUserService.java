package com.spring.microservices.jms.service;

import com.spring.microservices.jms.JmsProducer;
import com.spring.microservices.jms.JmsReceiver;
import com.spring.microservices.jms.domain.model.SystemUser;
import com.spring.microservices.jms.domain.respository.SystemUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemUserService {

    @Autowired
    private SystemUserRepository repository;

    @Autowired
    private JmsProducer jmsProducer;

    public void send(SystemUser user) {
        jmsProducer.postOne(user);
    }

    public List<SystemUser> getAll() {
        return repository.findAll();
    }
}
