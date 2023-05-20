package section13;

public class InnerClass02 {
	public static void main(String[] args) {
		new InnerClass02.InnerClass().info();
		new InnerClass().info();
	}
	
	static class InnerClass {
		public void info() {
			System.out.println("static 내부 클래스 일반메소드 입니다.");
		}
	}
	
}
