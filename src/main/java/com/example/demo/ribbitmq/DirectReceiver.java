package com.example.demo.ribbitmq;

import com.example.demo.config.RabbitConfig;
import com.example.demo.entity.SimpleUser;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/***
 * 绑定key模式
 * 接收
 *
 *
 */
@Component
public class DirectReceiver {
    // queues是指要监听的队列的名字
    @RabbitListener(queues = RabbitConfig.DIRECT_QUEUE1)
    public void receiveDirect1(SimpleUser user) {

        System.out.println("【receiveDirect1监听到消息】" + user);
    }

    @RabbitListener(queues = RabbitConfig.DIRECT_QUEUE1)
    public void receiveDirect2(SimpleUser user) {

        System.out.println("【receiveDirect2监听到消息】" + user);
    }

}
