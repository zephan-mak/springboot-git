package com.qf.springbootgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author maizifeng
 * @Date 2019/6/5
 */
@Controller
@RequestMapping("test")
public class TestController {
    @RequestMapping("test")
    public String test(){
          int a=0;
        System.out.println(a);
        return "test";
    }
}
