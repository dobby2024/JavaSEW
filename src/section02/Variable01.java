package section02;
/*
 * 1. 논리형(boolean)
 * 	true, false 두가지 값을 가지는 기본 자료형
 * 	1byte
 * 선언방법
 * 	boolean 변수명;
 * 
 */

public class Variable01 {
	public static void main(String[] args) {
		// 논리형 변수 선언하기
		boolean isWait;
		// 선언한 변수에 값 대입하기
		isWait = true;
		// 저장된 값을 문자열로 출력하기
		System.out.println("논리형 변수에 저장된 값: "+ isWait);
		
		// 선언과 동시 대입하기
		boolean isRun = false;
		
		isRun = true;	// 변수 값 변경
		System.out.println(isRun);
		
		
	}
}







