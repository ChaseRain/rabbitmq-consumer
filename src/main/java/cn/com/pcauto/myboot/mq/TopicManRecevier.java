package cn.com.pcauto.myboot.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by linlixin on 2020/11/29.
 */

@Component
@RabbitListener(queues = "topic.man")
public class TopicManRecevier {

    @RabbitHandler
    public void process(Map testMessage){
        System.out.println("TopicManReceiver消费者收到消息  : " + testMessage.toString());
    }
}
