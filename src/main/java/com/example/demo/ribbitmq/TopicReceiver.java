package com.example.demo.ribbitmq;

import com.example.demo.config.RabbitConfig;
import com.example.demo.entity.SimpleUser;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/***
 * 匹配模式
 * 接收
 */
@Component
public class TopicReceiver {
    // queues是指要监听的队列的名字
    @RabbitListener(queues = RabbitConfig.TOPIC_QUEUE1)
    public void receiveTopic1(SimpleUser user) {
        System.out.println("【receiveTopic1监听到消息】" + user.toString());
    }
    @RabbitListener(queues = RabbitConfig.TOPIC_QUEUE2)
    public void receiveTopic2(SimpleUser user) {
        System.out.println("【receiveTopic2监听到消息】" + user.toString());
    }

}
