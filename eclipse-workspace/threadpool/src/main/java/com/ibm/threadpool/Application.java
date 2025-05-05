package com.ibm.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application
{
	public static void main( String[] args )
	{
		int vCPUs = Runtime.getRuntime().availableProcessors();
		System.out.println(vCPUs);
		ExecutorService service = Executors.newFixedThreadPool(vCPUs);
		for(int counter=0;counter<10;counter++) {
			service.execute(new Task(counter));
		}
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