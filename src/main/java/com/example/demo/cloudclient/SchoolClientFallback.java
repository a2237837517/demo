package com.example.demo.cloudclient;

import org.springframework.stereotype.Component;

/**
 * 针对onezbillmanage-service，错降级处理
 */
@Component
public class SchoolClientFallback implements SchoolClient {


    @Override
    public String findSchoolStrById(String schoolID) {
        System.out.println("feign 调用onezbillmanage-service中findSchoolStrById方法异常");
        return "feign 调用onezbillmanage-service中findSchoolStrById方法异常";
    }
}
