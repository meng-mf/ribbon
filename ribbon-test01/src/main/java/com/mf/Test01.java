package com.mf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Test01
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/4
 * @Version V1.0
 **/
@SpringBootApplication
@EnableFeignClients
@RestController
public class Test01 {
    public static void main(String[] args){

        SpringApplication.run(Test01.class,args);

    }

    @RequestMapping("test41")
    public String test41(){
        System.out.println("----------test41-----------");
        return "test41-ok";
    }

}
