package com.ibm.threadpool;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Application
{
	public static void main( String[] args )
	{
		int vCPUs = Runtime.getRuntime().availableProcessors();
		System.out.println(vCPUs);
		ScheduledExecutorService service = Executors.newScheduledThreadPool(vCPUs);
//		for(int counter=0;counter<10;counter++) {
//			service.execute(new Task(counter));
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
//		}
		service.schedule(new Task(1), 10, TimeUnit.SECONDS);
		System.out.println(new Date());
		service.scheduleAtFixedRate(new Task(2), 10, 5, TimeUnit.SECONDS);
		service.scheduleWithFixedDelay(new Task(3), 10, 5, TimeUnit.SECONDS);
	}
	static class Task implements Runnable{
		int count;
		Task(int count){
			this.count=count;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(Thread.currentThread()+"--->"+count);
		}
		
	}
}