package section04;
/*
 * 2. switch ~ case문 (if문이랑 비슷)
 * 
 */
public class Conditional02 {
	public static void main(String[] args) {
		int num = 1;
		switch(num) {
		case 0 :
			System.out.println("0 입니다.");
			break;
		case 1 :
			System.out.println("1 입니다.");
			break;
		case 2 :
			System.out.println("2 입니다.");
			break;
		case 3 :
			System.out.println("3 입니다.");
			break;
		default: 
			System.out.println("0 ~ 3 이 아닙니다.");
			break;
		}
		
		
	}

}
