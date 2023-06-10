package section18;

public class Thread06 {
	public static void main(String[] args) {
		System.out.println("메인스레드가 시작됩니다.");
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("익명스레드가 시작됩니다.");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("익명스레드가 종료됩니다.");
				
			}
		}).start();
		
		System.out.println("메인스레드가 종됴됩니다.");
		
	}
}
