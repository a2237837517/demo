package com.example.demo.constroller;

import com.example.demo.cloudclient.SchoolClient;
import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*****
 * https://blog.csdn.net/vtopqx/article/category/7921897
 */
@RestController
public class TestSpringCloudConstroller {
    @Autowired
    private SchoolClient schoolClient;


    @RequestMapping("/hi")
    public String sayhi(){
        return  schoolClient.findSchoolStrById("59e223493e3d419ab68992e24c761ca8");
    }

    @RequestMapping("/helloWorld")
    public String helloWorld(){
        return "hello world!";
    }



    //这是一个服务的方法，如果有参数一定要带 再client 那@RequestParam
    @RequestMapping("/cloudServerMethods")
    public String cloudServerMethods(){
        return  "恭喜你调用成功自己的的方法，通过cloud";

    }
}
