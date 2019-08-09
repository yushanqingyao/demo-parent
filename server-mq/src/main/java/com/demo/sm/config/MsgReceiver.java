//package com.demo.sm.config;
//
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//import com.rabbitmq.client.Channel;
//
//import java.io.IOException;
//import java.util.Date;
//
//@Component
//@RabbitListener(queues="first")
//public class MsgReceiver {
//    @RabbitHandler
//    public void process(String hello,Channel channel, Message message) {
//        System.out.println("HelloReceiver收到  : " + hello +"收到时间"+new Date());
//        try {
//            //false只确认当前一个消息收到，true确认所有consumer获得的消息
//            channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);
//            System.out.println("receiver success");
//        } catch (IOException e) {
//            if (message.getMessageProperties().getRedelivered()) {
//
//                System.out.println("消息已重复处理失败,拒绝再次接收...");
//                try {
//                    //deliveryTag:该消息的index
//                    //requeue：被拒绝的是否重新入队列
//                    //channel.basicNack 与 channel.basicReject 的区别在于basicNack可以拒绝多条消息，而basicReject一次只能拒绝一条消息
//                    channel.basicReject(message.getMessageProperties().getDeliveryTag(), false);
//                } catch (IOException e1) {
//                }
//
//            } else {
//
//                System.out.println("消息即将再次返回队列处理...");
//
//                try {
//                    //deliveryTag:该消息的index
//                    //multiple：是否批量.true:将一次性拒绝所有小于deliveryTag的消息。
//                    //requeue：被拒绝的是否重新入队列
//                    channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true);
//                } catch (IOException e1) {
//                }
//
//            }
//        }
//
//    }
//
//}
