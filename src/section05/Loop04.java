package section05;

public class Loop04 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("i:%d -> sum:%d+%d=%d\n",i,i,sum,i+sum);
			sum += i; // sum = sum + i;
		}
		
		System.out.println("합: " + sum);
		
	}

}
