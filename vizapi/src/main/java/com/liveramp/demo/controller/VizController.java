package com.liveramp.demo.controller;

import com.liveramp.demo.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * description: VizController
 * date: 2021/11/3 3:57 PM
 * author: twu
 * version: 1.0
 */
@Controller
public class VizController {

    @Resource
    private DemoService service;


    @GetMapping("/viz")
    @ResponseBody
    public String getViz() {
        String run = service.run();
        return run;
    }
}
