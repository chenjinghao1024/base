package com.chen.base.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RunTask {

    public RunTask() {
    }

    /**
     *  每天 0:0:1 执行 1 0 0 ? * 1
     */
    @Scheduled(cron = "1 0 0 ? * *")
    public void syncOrder(){
        
    }
}
