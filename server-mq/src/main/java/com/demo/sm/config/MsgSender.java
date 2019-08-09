//package com.demo.sm.config;
//
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.Map;
//
//@Component
//public class MsgSender implements RabbitTemplate.ReturnCallback{
//    /**
//     * Spring AMQP提供了一个发送和接收消息的操作模板类AmqpTemplate。
//     * AmqpTemplate它定义包含了发送和接收消息等的一些基本的操作功能。RabbitTemplate是AmqpTemplate的一个实现。
//     *
//     * RabbitTemplate支持消息的确认与返回，为了返回消息，RabbitTemplate 需要设置mandatory 属性为true,并且CachingConnectionFactory 的publisherReturns属性也需要设置为true。
//     * 返回的消息会根据它注册的RabbitTemplate.ReturnCallback setReturnCallback 回调发送到给客户端，
//     *一个RabbitTemplate仅能支持一个ReturnCallback 。
//     *
//     * 为了确认Confirms消息, CachingConnectionFactory 的publisherConfirms 属性也需要设置为true，确认的消息会根据它注册的RabbitTemplate.
//     * ConfirmCallback setConfirmCallback回调发送到给客户端。
//     * 一个RabbitTemplate也仅能支持一个ConfirmCallback
//     */
//    @Autowired
////    private AmqpTemplate rabbitTemplate;
//    private RabbitTemplate rabbitTemplate;
//
//    /**
//     * @param routingKey 路由关键字
//     * @param msg 消息体
//     */
//    public void sendDirectMsg(String routingKey, Object msg) {
//        this.rabbitTemplate.setReturnCallback(this);
//        this.rabbitTemplate.setConfirmCallback((correlationData, ack, cause) -> {
//            if (!ack) {
//                System.out.println("HelloSender消息发送失败" + cause + correlationData.toString());
//            } else {
//                System.out.println("HelloSender 消息发送成功 ");
//            }
//        });
//
//        rabbitTemplate.convertAndSend(routingKey, msg);
//    }
//
//    /**
//     * @param routingKey 路由关键字
//     * @param msg 消息体
//     * @param exchange 交换机
//     */
//    public void sendExchangeMsg(String exchange, String routingKey, Object msg) {
//        rabbitTemplate.convertAndSend(exchange, routingKey, msg);
//    }
//
//    /**
//     * @param map 消息headers属性
//     * @param exchange 交换机
//     * @param msg 消息体
//     */
//    public void sendHeadersMsg(String exchange, Object msg, Map<String, Object> map) {
//        rabbitTemplate.convertAndSend(exchange, null, msg, message -> {
//            message.getMessageProperties().getHeaders().putAll(map);
//            return message;
//        });
//    }
//
//    @Override
//    public void returnedMessage(Message message, int i, String s, String s1, String s2) {
//        System.out.println("sender return success" + message.toString()+"==="+i+"==="+s1+"==="+s2);
//    }
//}
