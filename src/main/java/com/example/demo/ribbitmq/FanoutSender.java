package com.example.demo.ribbitmq;

import com.example.demo.config.RabbitConfig;
import com.example.demo.entity.SimpleUser;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/****广播模式
 * Fanout模式
 *
 * 消息发送类FanoutSender.java
 *
 * 3.Fanout模式
 *
 * 每个发到 fanout 类型交换器的消息都会分到所有绑定的队列上去。fanout 交换器不处理路由键，只是简单的将队列绑定到交换器上，每个发送到交换器的消息都会被转发到与该交换器绑定的所有队列上。很像子网广播，每台子网内的主机都获得了一份复制的消息。fanout 类型转发消息是最快的。
 */

@Component
public class FanoutSender {
    @Autowired

    private AmqpTemplate rabbitTemplate;

    public void send(SimpleUser user) {

        this.rabbitTemplate.convertAndSend(RabbitConfig.FANOUT_EXCHANGE, "", user);

    }
}
