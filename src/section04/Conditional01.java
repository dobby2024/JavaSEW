package section04;
/*
 * 조건문
 * 	주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 제어하는 명령문
 * 
 * 1. if 문
 * 	if(조건식) {
 * 		조건식이 true일 때 실행 명령문
 * 	}
 * 	
 *  if(조건식)
 * 		조건식이 true일 때 실행 명령문(명령문이 한줄(;) 일때 중괄호 생략 가능)
 * 	
 * 	if(조건식) {
 * 		조건식이 true일 때 실행 명령문
 *  } else {
 *  	조건식이 false일 때 실행 명령문
 *  }	
 * 	
 *  if(조건식1) {
 * 		조건식1 true일 때 실행 명령문
 *  } else if(조건식2) {
 *  	조건식2 true일 때 실행 명령문 
 *  } else if(조건식3) {
 *  	조건식3 true일 때 실행 명령문 
 *  } else {
 *  	조건식이 false일 때 실행 명령문
 *  }	
 * 
 */

public class Conditional01 {
	public static void main(String[] args) {
		int num = 11;
		if(num % 2 == 0) 
			System.out.println("num은 짝수 입니다.");
		
		if(num % 2 != 0)
			System.out.println("num은 홀수 입니다.");
		
		
		if(num % 2 == 0) {
			System.out.println("num은 짝수 입니다.");
		} else { 
			System.out.println("num은 홀수 입니다.");
		}
		
		double num2 = 13.5;
		if(num2 % 3 == 0) {
			System.out.println("num2는 나머지가 0 입니다.");
		} else if(num2 % 3 == 1) {
			System.out.println("num2는 나머지가 1 입니다.");
		} else if(num2 % 3 == 2) {
			System.out.println("num2는 나머지가 2 입니다.");
		} else {
			System.out.println("정수가 아닙니다.");
		}
		
		
		
	}

}






