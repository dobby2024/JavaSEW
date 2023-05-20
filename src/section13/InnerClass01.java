package section13;
/*
 * 내부 클래스(Inner Class)
 * 	클래스 내부에서 선언되고 사용되는 클래스를 의미 합니다.
 * 	내부 클래스는 외부 클래스의 멤버로 간주되며, 외부 클래스의 인스턴스와 밀접한 관계를 가진다.
 * 
 */
public class InnerClass01 {
	public static void main(String[] args) {
		InnerClass01.InnerClass.info();
		InnerClass.info();
	}
	
	static class InnerClass {
		public static void info() {
			System.out.println("static 내부 클래스 입니다.");
		}
	}
}
