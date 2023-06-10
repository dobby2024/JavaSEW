package section18;

import section18.access1.CountThread;

public class Thread07 {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작!");
		
		System.out.println(Thread.currentThread().getName());
		
		CountThread cThread = new CountThread();
		cThread.setName("CountThread-1");
		cThread.start();
		
		CountThread cThread2 = new CountThread();
		cThread2.setName("CountThread-2");
		cThread2.start();
		
		System.out.println("메인스레드 종료!");
	}

}
