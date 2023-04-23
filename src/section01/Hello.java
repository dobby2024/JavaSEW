package section01;
/* 여러줄 주석
 * 
 * 
 */

public class Hello {
	public static void main(String[] args) {
		// 한줄 주석
		System.out.println("Hello, JAVA!!!");
		
		// 정수 출력 하는 메소드
		printNum(422);
		
	}
	
	/** JavaDoc 주석
	 * auth : 김태호
	 * 생성일 : 2023.04.22
	 * 
	 * printNum - 입력받은 정수 출력 
	 * 
	 * @param num
	 */
	public static void printNum(int num) {
		System.out.println("num: " + num);
	}
	
}


