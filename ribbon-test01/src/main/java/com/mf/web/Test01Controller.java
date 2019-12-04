package com.mf.web;

import com.mf.api.TestApi;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Test01Controller
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/4
 * @Version V1.0
 **/

@RestController
public class Test01Controller {
    @Autowired
    private TestApi testApi;

    @RequestMapping("test02/{name}")
//    @HystrixCommand(fallbackMethod = "testBack")
    public String test(@PathVariable String name){
        for (int i = 0; i < 10000; i++) {
            testApi.test01(name);
        }
        return testApi.test01(name);
    }
}
