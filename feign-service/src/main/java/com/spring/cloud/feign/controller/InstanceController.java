package com.spring.cloud.feign.controller;

import com.spring.cloud.feign.client.InstanceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstanceController {

    @Autowired
    private InstanceClient instanceClient;

    @RequestMapping(value = "getInstance")
    public String getInstance() {
        return instanceClient.getInstance();
    }
}
