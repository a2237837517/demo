package com.example.demo;

import com.example.demo.entity.SimpleUser;
import com.example.demo.ribbitmq.DirectSender;
import com.example.demo.ribbitmq.FanoutSender;
import com.example.demo.ribbitmq.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/******
 * https://blog.csdn.net/qq_38157516/article/details/82384762
 *
 */
@RunWith(SpringRunner.class)
//测试的时候可以指定测试类 这样可以直接测试。
@SpringBootTest(classes = DemoApplication.class)
public class DemoRabbitMqApplicationTests {
    @Autowired
    private FanoutSender fanoutSender;
    @Autowired
    private TopicSender topicSender;
    @Autowired
    private DirectSender directSender;
    @Test
    public void contextLoads() {
    }
    /**
     * Fanout测试
     * @throws Exception
     */
    @Test
    public void testFanout() throws Exception {
        SimpleUser user=new SimpleUser();
        user.setId("1");
        user.setName("pwl");
        fanoutSender.send(user);
    }



    /**
     * TOPIC测试
     * @throws Exception
     */
    @Test
    public void testTopic() throws Exception {
        SimpleUser user=new SimpleUser();
        user.setId("1");
        user.setName("pwl");
        topicSender.send(user);
    }

    /**
     * DIRECT测试
     * @throws Exception
     */
    @Test
    public void testDirect() throws Exception {
        SimpleUser user=new SimpleUser();
        user.setId("1");
        user.setName("pwl");
        directSender.send(user);
    }



}
