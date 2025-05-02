package com.ibm.thread;

class Runner implements Runnable{
	
	@Override
	public void run() {
		for(int c=0;c<10;c++) {
			System.out.println(Thread.currentThread()+"--->"+String.valueOf(c));
		}
	}
}

public class Application
{
	public static void main( String[] args )
	{
		Runner runner = new Runner();
		Thread thread1= new Thread(runner);
		System.out.println(thread1.getState());
		thread1.start();
		System.out.println(thread1.getState());
		try {
			Thread.sleep(100);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(thread1.getState());
	}
}