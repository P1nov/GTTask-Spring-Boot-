package com.leiyonglin.redis.service;

public interface RedisService {

    public void set(String key, String value);

    public String get(String key);

    public boolean remove(String key);
}
