package common.quartz;

import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration 
@EnableAsync 
@EnableScheduling
public class TaskAnnoExample {
	
	@Scheduled(cron="*/5 * * * * ?")
	public void doSomething() {
	    System.out.println("配置注解的方式任务调度："+new Date());
	}
}
