package com.example.retryspringbootexample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author youping.tan
 * @date 2024/12/4 15:06
 */
@Service
@Slf4j
public class DemoService {

    @Retryable(retries = 5, fallback = "fallback",millis = 5000)
    public void performTask(boolean success) {
        if (success) {
            log.info("执行成功!");
        }else {
            log.error("执行失败");
            throw new RuntimeException();
        }
    }

    public void fallback() {
        log.error("重试全部失败，调用回调接口");
    }
}
