package section02;
/*
 * 변수
 * 	메모리 공간에 붙여진 이름
 * 	개발자가 필요한 값들을 메모리에 저장해두고 필요할 때마다 꺼내서 사용.
 * 
 * 변수 선언 및 초기화
 * 	자료형 변수명 = 값;
 * 
 * 
 * 기본 자료형
 * 	자바에서 기본적으로 제공해주는 자료형이다.
 * 		정수형 - byte, short, int, long
 * 		실수형 - float, double
 * 		문자형 - char
 * 		논리형 - boolean
 * 
 */
public class Variable {
	// 프로그램 시작 메인메소드
	public static void main(String[] args) {
		// 정수형 변수 선언하고 값 대입하기.
		int numInt = 10;
		
		// 실수형 변수 선언하고 값 대입하기.
		double numDouble = 10.1;
		
		// 문자열 변수 선언하고 값 대입하기.
		String str = "Hello";
		
		System.out.println(numInt);
		System.out.println(numDouble);
		System.out.println(str);
		
		
	}
}
