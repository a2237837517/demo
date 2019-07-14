package com.example.demo.ribbitmq;

import com.example.demo.config.RabbitConfig;
import com.example.demo.entity.SimpleUser;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * 绑定key模式
 * 发送
 *
 *
 * 1.Direct模式
 *
 * 消息中的路由键（routing key）如果和 Binding 中的 binding key 一致， 交换器就将消息发到对应的队列中。路由键与队列名完全匹配
 */
@Component
public class DirectSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(SimpleUser user) {
        this.rabbitTemplate.convertAndSend(RabbitConfig.DIRECT_EXCHANGE, "direct.pwl", user);
    }

}
