package com.liveramp.demo.service.impl;

import com.liveramp.demo.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * description: DemoServiceImpl
 * date: 2021/11/3 3:51 PM
 * author: twu
 * version: 1.0
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String run() {
        System.out.println("running ===============");
        return "success";
    }
}
