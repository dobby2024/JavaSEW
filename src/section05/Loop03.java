package section05;
/*
 * 3. for문
 * 	초기식, 조건식, 증감식을 이용하여 반복적으로 코드 블록을 실행하는 제어문
 * 
 * 	for(초기식; 조건식; 증감식) {
 * 		반복수행할 코드
 * 	}
 * 
 * 	1. 초기식 -> 2.조건식 (조건식이 true) -> 3. 반복수행할 코드 -> 4.증감식 
 * 	-> 2.번으로 조건식부터 반복
 * 
 */
public class Loop03 {
	public static void main(String[] args) {
		// for문을 이용하여 0부터 9까지 숫자를 출력하기
		for (int i = 0; i < 10; i++) {
			System.out.println(i); 	// i 값 출력하기
		}
		
		int i = 0;	// 초기식
		while(i < 10) {	// 조건식
			System.out.println(i); // 수행할 코드
			i++;	// 증감식
		}
		
	}
}









