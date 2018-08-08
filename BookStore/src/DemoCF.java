import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoCF {

	public static void main(String[] args) {
		// array :: fix length
		int[] numbers = { 1, 2, 3 };
		System.out.println(numbers.length);
		for (int i : numbers) {
			System.out.print(i + ", ");
		}
		System.out.println();

		// List :: dynamic array
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		int size = numberList.size();
		System.out.println("Size : " + size);
		// For each
		for (Integer integer : numberList) {
			System.out.println(integer + ", ");
		}
		System.out.println();
		// For by index
		for (int i = 0; i < size; i++) {
			System.out.println(numberList.get(i) + ", ");
		}

		// Map
		Map<String, Integer> employees = new HashMap<>();
		employees.put("name", 30);
		employees.put("nickName", 40);
		System.out.println(employees.get("name"));
		if (!employees.containsKey("xxx")) {
			System.out.println("Key not found");
		}
		// Map + iterate
		Set<String> keys = employees.keySet();
		for (String key : keys) {
			System.out.printf("%s -> %d\n", key, employees.get(key));
		}
	}

}
