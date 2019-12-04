package com.mf.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Test02Controller
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/4
 * @Version V1.0
 **/
@RestController
public class Test02Controller {
    @RequestMapping("test01")
    public String test(String name){
        System.out.println("-------name----------"+name);
        return "test02-ok";
    }
}
