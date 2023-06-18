package section17;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// 매개값을 사용해 조사(조건) 후 논리값을 반환하다. Predicate 구현
class EvenNumberPredicate implements Predicate<Integer> {
	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}
}

// 매개값을 반환값으로 매핑(변환)하는 역할. Function 구현
class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		return number * number;
	}
	
}

// 매개변수를 받아서 소비하는 일을 구현하는 역할. Consumer 구현
class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}
}







public class Lambda04 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(23, 43, 34, 45, 36, 48);
//		List<Integer> numbers = List.of(23, 43, 34, 45, 36, 48);
		
		numbers.stream()
				.filter(n -> n % 2 == 0)
				.map(n -> n * n)
				.forEach(System.out::println);
		
		System.out.println("=============================");
		
		numbers.stream()
			.filter(new EvenNumberPredicate())
			.map(new NumberSquareMapper())
			.forEach(new SystemOutConsumer());
	}
}







