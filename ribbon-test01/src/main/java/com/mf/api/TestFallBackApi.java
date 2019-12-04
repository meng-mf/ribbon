package com.mf.api;

/**
 * @ClassName TestFallBackApi
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/4
 * @Version V1.0
 **/
public class TestFallBackApi implements TestApi{
    @Override
    public String test01(String name) {
        return "出错了";
    }
}
