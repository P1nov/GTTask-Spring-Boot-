package com.leiyonglin.common.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
@ConfigurationProperties(prefix = "spring.redis")
public class RedisConfig {

    @Bean
    public JedisPoolConfig getRedisConfig() {

        JedisPoolConfig config = new JedisPoolConfig();

        return config;
    }

    @Bean
    public JedisConnectionFactory getConnectFactory(){

        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setUsePool(true);

        JedisPoolConfig config = getRedisConfig();
        factory.setPoolConfig(config);

        return factory;
    }

    @Bean
    public RedisTemplate<?, ?> getRedisTemplate() {

        JedisConnectionFactory factory = getConnectFactory();
        RedisTemplate<?, ?> template = new StringRedisTemplate(factory);
        return template;
    }
}
