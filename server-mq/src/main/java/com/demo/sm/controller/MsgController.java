//package com.demo.sm.controller;
//
//import com.demo.sm.config.MsgSender;
//import com.demo.sm.config.RabbitConfig;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class MsgController {
//    @Autowired
//    private MsgSender sender;
//
//    @RequestMapping("/send/{routingKey}/{msg}")
//    public String send(@PathVariable("routingKey") String routingKey, @PathVariable("msg") String msg) {
//        sender.sendExchangeMsg(RabbitConfig.fanoutExchange, routingKey, msg);
//        return "success";
//    }
//
//}
