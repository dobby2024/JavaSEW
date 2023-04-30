package section06;

public class Array03 {
	public static void main(String[] args) {
		// new 연산자 사용하지 않고 직접 배열 값 대입하기
		String[] names = {"피카츄", "라이츄", "파이리", "꼬부기", "버터플", "야도란"};
		
		// 배열 내용 출력해보기
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("========================================");
		
		// 배열 값 수정하기
		names[5] = "잠만보";
		
		// 확장 for문
		for(String name : names) {
			System.out.println(name);
		}
		
	}

}




