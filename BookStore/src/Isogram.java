import java.util.HashSet;
import java.util.Set;

public class Isogram {

	public boolean check(String input) {
		input = input.toLowerCase().replaceAll("[^\\w]", "");
		boolean result = true;
		Set<Character> inputSet = new HashSet<>();
		int inputLength = input.length();
		for (int i = 0; i < inputLength; i++) {
			if(!inputSet.add(input.charAt(i))) {
				result = false;
			}
		}
		return result;
	}

}
