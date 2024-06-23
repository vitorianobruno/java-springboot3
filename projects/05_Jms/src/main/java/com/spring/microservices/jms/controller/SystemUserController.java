package com.spring.microservices.jms.controller;

import com.spring.microservices.jms.domain.model.SystemUser;
import com.spring.microservices.jms.service.SystemUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class SystemUserController {

    @Autowired
    private SystemUserService suService;

    @PostMapping
    public void postForSystemUser(@RequestBody SystemUser user) {
        suService.send(user);
    }

    @GetMapping
    public List<SystemUser> getForSystemUserList() {
        return suService.getAll();
    }
}
