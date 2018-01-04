package common.quartz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		/*ApplicationContext cxt = new ClassPathXmlApplicationContext("classpath:applicationContext-quartz.xml");
		TaskExecutorExample taskExecutorExample = (TaskExecutorExample)cxt.getBean("taskExecutorExample");
		taskExecutorExample.printMessages();*/
		
		/*ApplicationContext cxt = new ClassPathXmlApplicationContext("classpath:applicationContext-quartz.xml");
		TaskScheduleExample taskSchesduler = (TaskScheduleExample)cxt.getBean("taskSchesdulerExample");
		taskSchesduler.exeTask();*/
		ApplicationContext cxt = new ClassPathXmlApplicationContext("classpath:applicationContext-quartz.xml");
	}
}
