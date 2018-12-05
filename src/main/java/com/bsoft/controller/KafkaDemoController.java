package com.bsoft.controller;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * KafkaDemoController
 * @description 测试kafka
 * @author zk
 * @date 2018年11月29日 上午10:54:26
 * @version 1.0
 */
@RestController
public class KafkaDemoController {
	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
	/**
     * 发送消息的方法
     *
     * @param key  推送数据的key
     * @param data 推送数据的data
     */
    private void send(String key, String data) {
        kafkaTemplate.send("tt2", key, data);
    }

    @GetMapping("/kafkatest")
    public String testKafka() {
        int iMax = 6;
        for (int i = 1; i < iMax; i++) {
            send("key" + i, "data" + i);
        }
        return "success";
    }
    
    private static Logger logger = LoggerFactory.getLogger(KafkaDemoController.class);
    
    @KafkaListener(topics = {"tt2"})
    public void receive(ConsumerRecord<?, ?> consumer) {
    	logger.info("{} - {}:{}", consumer.topic(), consumer.key(), consumer.value());
    }

}
