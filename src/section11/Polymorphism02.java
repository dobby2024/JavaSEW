package section11;

import section11.access1.Bus;
import section11.access1.Car;
import section11.access1.SchoolBus;

public class Polymorphism02 {
	
	public static void main(String[] args) {
		
		//1번 Car 클래스의 drive() "운전을 합니다."
		//2번 Bus 클래스의 driver() "승객을 태우고 운전 합니다."
		//3번 SchoolBus 클래스의 driver() "학생을 태우고 운전을 합니다."
		
		SchoolBus sb1 = new SchoolBus(); 
		sb1.drive(); // Q1-3
		
		System.out.println("sb1: " + System.identityHashCode(sb1));
		
		Car c1 = sb1;
		c1.drive();	// Q2-3
		
		System.out.println("c1: " + System.identityHashCode(c1));
				
		Bus b1 = (Bus) c1;
		b1.drive(); // Q3-3
		
		System.out.println("b1: " + System.identityHashCode(b1));
		
		System.out.println("sb1.color:" + sb1.color);
		System.out.println("c1.color:" + c1.color);
		System.out.println("b1.color:" + b1.color);
		
		b1.color ="Red";
		
		System.out.println("sb1.color:" + sb1.color);
		System.out.println("c1.color:" + c1.color);
		System.out.println("b1.color:" + b1.color);
		
		
	}
}











