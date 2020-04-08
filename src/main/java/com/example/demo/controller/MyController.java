package com.example.demo.controller;


import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    String getTest() {
        System.out.print("汉字显示是否正常。");
        return "test";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello() {
        System.out.print("开始测试thymeleaf解析器13");

        return "pages/hello";
    }



    /**
     * @param x
     * @return
     */
    String test(String x) {
        System.out.println("this is a test for idea");
        return "test";
    }

    public static void main(String[] args) {
        System.out.println("this is a test for idea 1");
        System.out.println("this is a test for idea 2");

    }

    @Test
    public void testUnit(){
        System.out.println("this is a test for junit");
    }

}
