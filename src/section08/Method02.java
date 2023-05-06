package section08;

public class Method02 {
	
	private static String name;	// 전역변수 name 선언
	
	public static void main(String[] args) {
		setName("홍길동");
		
		String name1 = getName();
		System.out.println("name1: " + name1);
		
		int addNum = add(10, 5);
		System.out.println("addNum: " + addNum);
		
		int sumNum = sum(1,2,3);
		System.out.println("sumNum: "+ sumNum);
		
		int[] arr = {1, 2, 3, 4, 5};
		int arrSum = sum(arr);
		System.out.println("arrSum: " + arrSum);
		
		int[] arr2 = {1, 2, 3, 4, 5};
		int[] result = sumAndAvg(arr2);
		
		System.out.println("합계(result[0]): " + result[0]);
		System.out.println("평균(result[1]): " + result[1]);
		
	}
	
	// 6. 인자 x 리턴 o 
	public static String getName() {
		return Method02.name;
	}
	
	public static void setName(String name) { // String name = "홍길동";
		Method02.name = name;
	}
	
	// 7 인자 o 리턴 o
	public static int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	// 7-2. 인자 o 리턴 o
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	// 7-3. 인자 o - 배열 리턴 o (오버라이딩)
	public static int sum(int[] args) {	// int[] args = {1,2,3,4,5};
		int sum = 0;
		for(int arg: args) {
			sum += arg;	// sum = sum + arg;
		}
		return sum;
	}
	
	// 7-4 인자 o - 배열 리턴 o - 배열
	public static int[] sumAndAvg(int[] args) {
		int[] result = new int[2];
		int sum = 0;
		for(int arg: args) {
			sum += arg;	// sum = sum + arg;
		}
		
		int avg = sum / args.length;
		
		result[0] = sum;
		result[1] = avg;
		
		return result;
	}
}













