package com.example.demo.cloudclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述
 *
 * @author onezzheng
 * @create 2019-03-18 19:21
 * 推荐用一个完全相同的对象来接收。
 **/
@FeignClient(name="onezbillmanage-service",fallback = SchoolClientFallback.class)
public interface SchoolClient {
    @RequestMapping(value = "/99OneZBillManage/api/v1/school/getSchoolStrByID",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    String findSchoolStrById(@RequestParam(value = "schoolID") String schoolID);

}
