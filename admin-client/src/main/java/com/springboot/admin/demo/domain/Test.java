package com.springboot.admin.demo.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j

public class Test {

    @Scheduled(cron = "* * * * * ?")
    public void test() {
//        System.out.println("99999999");
        log.info("time：" + new Date());
    }
}
