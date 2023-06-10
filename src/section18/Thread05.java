package section18;

import section18.access3.InterThread;

/*
 * Runnable 인터페이스
 * 	Thread 상속대신 Runnable 인터페이스 상속받아 Thread 객체 생성할 수 있다.
 * 
 */
public class Thread05 {
	public static void main(String[] args) {
		System.out.println("메인스레드가 시작됩니다.");
		
		Runnable iThread = new InterThread();
		// Runnable 구현한 객체를 Thread 생성자 인자로 전달
		Thread thread = new Thread(iThread);
		// Thread 객체의 start() 메소드로 스레드 시작 가능!
		thread.start();
		
		System.out.println("메인스레드가 종료됩니다.");
	}
}










