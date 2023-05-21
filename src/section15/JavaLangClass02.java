package section15;

import section15.access1.Sports;

/*
 * 1. 얕은복사 (Shallow Copy)
 * 	- 참조형 변수에 주소값만 복사!
 * 	- 동일한 객체를 참조하게 된다.
 * 
 * 2. 깊은복사 (Deep Copy)
 * 	- 객체의 멤버 변수 값과 객체가 참조하는 객체까지 모두 복사하는 방식!
 * 	- 새로운(다른) 객체를 참조하게 된다.
 * 
 */


public class JavaLangClass02 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Sports sports1 = new Sports("축구", true);
		Sports sports2 = sports1;
		Object obj1 = sports1;	// 다형성
		
		Sports sports3 = (Sports) sports1.callClone();
		
		
		if(sports1.equals(sports2)) {
			System.out.println("sports1 과 sports2는 같습니다.");
		} else {
			System.out.println("sports1 과 sports2는 다릅니다.");
		}
		
		System.out.println(sports1.hashCode());
		System.out.println(sports2.hashCode());
		
		if(sports1.equals(obj1)) {
			System.out.println("sports1 과 obj1는 같습니다.");
		} else {
			System.out.println("sports1 과 obj1는 다릅니다.");
		}
		
		
		if(sports1.equals(sports3)) {
			System.out.println("sports1 과 sports3는 같습니다.");
		} else {
			System.out.println("sports1 과 sports3는 다릅니다.");
		}
		
		
		
		
		
	}
}
