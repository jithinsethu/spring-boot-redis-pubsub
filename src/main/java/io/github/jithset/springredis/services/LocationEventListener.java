package io.github.jithset.springredis.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LocationEventListener implements MessageListener {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    @Qualifier("pubsubRedisTemplate")
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public void onMessage(Message message, byte[] pattern) {

        log.info("New message received: {}", message);
//            OrderEvent orderEvent = objectMapper.readValue(message.getBody(), OrderEvent.class);
//            redisTemplate.opsForValue().set(orderEvent.getOrderId(), orderEvent);
    }
}
