package com.gree.www.service;

import org.springframework.stereotype.Service;

@Service("testService")
public class TestService {

    public void test(){
        System.out.println("[spring!]:TestService out");
    }

}
