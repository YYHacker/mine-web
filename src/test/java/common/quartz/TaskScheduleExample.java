package common.quartz;

import java.util.Date;

import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.support.CronTrigger;

public class TaskScheduleExample {
	private class TaskWork implements Runnable {
		
	@Override
	public void run() {
			System.out.println(new Date());
		}
	}

	private TaskScheduler taskScheduler;
	
	public TaskScheduleExample(TaskScheduler taskScheduler){
		this.taskScheduler = taskScheduler;
	}
	
	public void exeTask(){
		taskScheduler.schedule(new TaskWork(), new CronTrigger("2/5 * * * * ?"));
	}
}
