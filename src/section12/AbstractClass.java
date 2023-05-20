package section12;

import section12.access1.Human;
import section12.access1.Man;

/*
 * 추상클래스(Abstract Class)
 * 	구현되지 않은 추상 메소드가 존재하는 클래스.
 * 	미완성 클래스
 * 	추상클래스는 'abstract' 키워드를 사용하여 선언된다.
 * 
 * 추상메소드
 * 	메소드의 선언부만 있고, 실제 구현되지 않음. 
 * 	상속받은 하위클래스에서 구현이 이루어진다.(오버라이딩)
 * 	추상메소드는 'abstract' 키워드를 사용하여 선언된다.
 * 
 */
public class AbstractClass {
	public static void main(String[] args) {
//		Human p1 = new Human(); 	// 추상클래스 직접생성 불가능
		
		Man m1 = new Man();
		m1.useFire();
		m1.say();
		
		m1.setName("차은우");
		String name = m1.getName();
		System.out.println("m1 이름 : " + name);
		
		m1.setAge(25);
		int age = m1.getAge();
		System.out.println("m1 나이 : " + age);
		
	}
}




















