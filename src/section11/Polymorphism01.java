package section11;

import section11.access1.Car;
import section11.access1.SchoolBus;
import section11.access1.Bus;

/*
 * 다형성(Polymorphism)
 * 	같은 인터페이스 또는 부모를 공유하는 객체가 여러 유형의 타입을 가질 수 있는것
 * 
 */

public class Polymorphism01 {
	public static void main(String[] args) {
		Bus b1  = new Bus();
		b1.btnBell();
		b1.drive();
		
		Car c1 = new Bus();
		c1.drive();
//		c1.btnBell();
		
		Bus b2 = new SchoolBus();
		b2.drive();
//		b2.stopPannel();
		
		SchoolBus sb1 = (SchoolBus)b2; // 강제 형변환
		sb1.drive();
		sb1.stopPannel();
		
	}
}










