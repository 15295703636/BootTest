package com.bill99.boot.bootTest.config;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SchedulingConfig {
	
	@Scheduled(cron = "0 0/10 * * *  ? ")
	public void scheduler(){
		System.out.println("执行定时任务>>>"+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}
}
