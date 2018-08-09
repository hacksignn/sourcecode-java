import java.util.ArrayList;
import java.util.List;

public class DemoLD {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(1);

		for (Integer integer : numbers) {
			System.out.println(integer);
		}

		numbers.forEach(System.out::println);

		numbers.stream().map(i -> i * 2).forEach(System.out::println);
	}
}
