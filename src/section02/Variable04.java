package section02;
/*
 * 4. 실수형
 * 	소수부나 지수부가 있는 수를 가르킨다.
 * 	실수를 저장할 수 있는 자료형
 * 	
 * 	float	(4byte)	(3.4*10^-38)~(3.410^38) 소수점 7자리 표현
 * 	double	(8byte)	(1.7*10^-308)~(1.7*10^308) 소수점 15자리 표현	
 * 
 */

public class Variable04 {
	public static void main(String[] args) {
		float iFloat = 10.1f;
		double iDouble = 10.1d;
		double iDouble2 = 10.1;	// double형 d생략 가능
		
		System.out.println("float 형: "+ iFloat);
		System.out.println("double 형: "+ iDouble);
		System.out.println("double2 형: "+ iDouble2);
		
	}
}





