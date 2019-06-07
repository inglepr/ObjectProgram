package singletonpattern;


public class ThreadSafety {
public static void main (String args[])throws InterruptedException{
	
	ProcessingThread pt=new ProcessingThread();
	 Thread t1=new Thread(pt,"t1");
	 t1.start();
	 Thread t2=new Thread(pt,"t2");
	 t2.start();
	 //wait thread to complete
	 
	t1.join();
	t2.join();
	System.out.println("processing Thread"+pt.getCount());}}

 class ProcessingThread implements Runnable {
	private int count;
@Override
public void run() {
	for(int i=0;i<5;i++) {
		ProcessSomthing(i);
		count++;
		
	}
	
	
}

	private void ProcessSomthing(int i) {
	try{
		Thread.sleep(i*1000);
	}
	catch(InterruptedException e) {
	e.printStackTrace();
	}
}

	public int getCount() {
		
		return this.count;
	}}
