package section13.access1;

public class MyUtil {
	public String str1 = "str1";
	public static String staticStr1 = "staticStr1";
	
	// 1. 인스턴스 내부클래스
	public class HelloPrinter {
		public void printHello() {
			System.out.println("내부 클래스 HelloPrinter 입니다.");
			System.out.println(str1);		//1. 가능
			System.out.println(staticStr1);	//2. 가능
		}
	}
	// 2. static 내부 클래스
	public static class Calculator {
		public void calc(int a, int b) {
			int result = a + b;
			System.out.println("전달 받은 두 정수의 합 : " + result);
			// System.out.println(str1);	//3. 불가능?
			System.out.println(staticStr1);	//4. 가능
		}
	}
}
