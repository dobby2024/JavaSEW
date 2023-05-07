package section08;
/*
 *  메소드 구조
 * 	(접근제한자) (정적) 반환타입 메소드이름(매개변수타입 매개변수명) {
 * 		실행할 코드(명령문 집합)
 * 		(return 반환값;)
 * 	}
 * 
 */
public class Method04 {
	public static void main(String[] args) {
		
		int result = sum(1, 3);
		result = sum(4, 5);
		printNum(5);	
		System.out.println(result);
		
		String strNum = "5";
		printNum(strNum);
	}
	
	public static int sum(int a, int b) {	// int a = 4, b = 5;
		int sum = a + b;
		return sum;
	}
	
	public static void printNum(int c) {
		System.out.println("c : " + c);
	}
	// 오버로딩
	public static void printNum(int c, int d) {
		System.out.println("c : " + c);
	}
	
	public static void printNum(String c) {
		System.out.println("c : " + c);
	}
	
	
	
	
}









