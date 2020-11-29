/*
package cn.com.pcauto.myboot.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

*/
/**
 * Created by linlixin on 2020/11/29.
 *//*


@Component
@RabbitListener(queues = "TestDirectQueue")//监听队列名称 TestDirectQueue
public class DirectReceiverNew {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("第二个-DirectReceiver消费者收到信息 ： " + testMessage.toString());
    }

}
*/
