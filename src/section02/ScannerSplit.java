package section02;

import java.util.Scanner;
/*
 * Scanner
 * 	콘솔에서 입력받는 객체
 * 
 * 
 */
public class ScannerSplit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name, address;
		int age;
		double weight;
		
		System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요.");
		name = scanner.next();
		address = scanner.next();
		age = scanner.nextInt();
		weight = scanner.nextDouble();
		
		System.out.printf("당신의 이름은 %s입니다.\n", name);
		System.out.printf("당신의 주소는 %s입니다.\n", address);
		System.out.printf("당신의 나이는 %d입니다.\n", age);
		System.out.printf("당신의 체중은 %.1fkg입니다.\n", weight);
		
	}

}







