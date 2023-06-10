package section18;

import section18.access1.CountThread;

public class Thread03 {
	public static void main(String[] args) {
		System.out.println("메인스레드가 시작됩니다.");
		
		CountThread cThread = new CountThread();
		cThread.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i*100);

			try {
				Thread.sleep(500); 	// 0.5초 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("메인스레드가 종료됩니다.");
		
	}
}
