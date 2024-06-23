package com.spring.microservices.jms;

import com.spring.microservices.jms.domain.model.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsProducer {

    @Autowired
    private final JmsTemplate jmsTemplate;

    public JmsProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    };

    public void postOne(SystemUser user) {
        // enqueue --> send to queue
        jmsTemplate.convertAndSend(JmsReceiver.Q_ONE, user);
    }
}

