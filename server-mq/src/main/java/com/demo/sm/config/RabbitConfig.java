//package com.demo.sm.config;
//
//import org.springframework.amqp.core.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//public class RabbitConfig {
//    public static final String directExchangeName = "direct-exchange";
//    public static final String topicExchangeName = "topic-exchange";
//    public static final String fanoutExchange = "fanout-exchange";
//    public static final String headersExchange = "headers-exchange";
//
//    @Bean
//    public Queue queue() {
//        //构造默认持久化
//        return new Queue("first");
//    }
//
//
//    /**
//     * 声明direct交换机
//     * 路由模式(Direct)
//     * ​direct 类型的行为是"先匹配, 再投送"。即在绑定时设定一个 routing_key, 消息的routing_key 匹配时, 才会被交换器投送到绑定的队列中去
//     * @return
//     */
//    @Bean
//    DirectExchange directExchange(){
//        return new DirectExchange(directExchangeName);
//    }
//
//    /**
//     * 声明Topic交换机
//     * 通配符模式(Topic)
//     * 类似路由模式，但是routing_key支持模糊匹配，按规则转发消息（最灵活）。符号“#”匹配一个或多个词，符号“*”匹配不多不少一个词。
//     * @return
//     */
//    @Bean
//    TopicExchange topicExchange() {
//        //构造默认持久化
//        return new TopicExchange(topicExchangeName);
//    }
//
//    /**
//     * 声明Fanout交换机
//     * 发布订阅模式(Fanout)
//     * 转发消息到所有绑定队列，忽略routing_key
//     * @return
//     */
//    @Bean
//    FanoutExchange fanoutExchange() {
//        return new FanoutExchange(fanoutExchange);
//    }
//
//    /**
//     * 声明Headers交换机
//     * 在队列与交换器绑定时, 会设定一组键值对规则, 消息中也包括一组键值对( headers 属性), 当这些键值对有一对, 或全部匹配时, 消息被投送到对应队列
//     * @return
//     */
//    @Bean
//    HeadersExchange headersExchange() {
//        return new HeadersExchange(headersExchange);
//    }
//
//    @Bean
//    Binding directBinding(Queue queue, DirectExchange directExchange){
//        return BindingBuilder.bind(queue).to(directExchange).with("dir");
//    }
//    @Bean
//    Binding topicBinding(Queue queue,TopicExchange topicExchange) {
//        return BindingBuilder.bind(queue).to(topicExchange).with("org.cord.#");
//    }
//
//    @Bean
//    Binding fanoutBinding(Queue queue, FanoutExchange fanoutExchange) {
//        return BindingBuilder.bind(queue).to(fanoutExchange);
//    }
//
//    //将队列与headers交换机进行绑定
//    @Bean
//    Binding headersBinding(Queue queue, HeadersExchange headersExchange) {
//        Map<String, Object> map = new HashMap<>();
//        map.put("First","A");
//        map.put("Fourth","D");
//        //whereAny表示部分匹配，whereAll表示全部匹配
////        return BindingBuilder.bind(queue).to(headersExchange).whereAll(map).match();
//        return BindingBuilder.bind(queue).to(headersExchange).whereAny(map).match();
//    }
//
//
//
//}
