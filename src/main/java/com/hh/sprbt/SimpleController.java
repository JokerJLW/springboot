/*
 * Copyright (c) 2008-2016 浩瀚深度 All Rights Reserved.
 *
 * FileName: SimpleController.java
 *
 * Description：
 *
 * History:
 * v1.0.0, jlw, 2016年4月21日, Create
 */
package com.hh.sprbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author jlw
 * @version 1.0.0
 * @since 1.0.0
 *
 */
@Controller
@EnableAutoConfiguration
public class SimpleController
{
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello()
    {
        return "hello world!";
    }
    
    @RequestMapping(value="/getHelloData", method = RequestMethod.GET)
    @ResponseBody
    public String getHelloData()
    {
        
        return "";
    }
    
    public static void main(String[] args)
    {
        SpringApplication.run(SimpleController.class, args);
    }

}
