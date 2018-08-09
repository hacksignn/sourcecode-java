package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyRange {

	private String input;
	private final List<Integer> rangeList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

	public String getRangeInput() {
		return input;
	}

	public MyRange(String input) {
		this.input = input;
	}

	public boolean checkFormat() {
		return (startWithInclude() || startWithExclude()) && (endWithInclude() || endWithExclude());
	}

	public boolean startWithInclude() {
		boolean result = false;
		if (this.getRangeInput().startsWith("[")) {
			result = true;
		}
		return result;
	}

	public boolean startWithExclude() {
		boolean result = false;
		if (this.getRangeInput().startsWith("(")) {
			result = true;
		}
		return result;
	}

	public boolean endWithInclude() {
		boolean result = false;
		if (this.getRangeInput().endsWith("]")) {
			result = true;
		}
		return result;
	}

	public boolean endWithExclude() {
		boolean result = false;
		if (this.getRangeInput().endsWith(")")) {
			result = true;
		}
		return result;
	}

	public String getFirstValue() {
		if (checkFormat()) {
			return this.getRangeInput().substring(1, this.getRangeInput().indexOf(","));
		}
		return null;
	}

	public String getSecondValue() {
		if (checkFormat()) {
			return this.getRangeInput().substring(this.getRangeInput().indexOf(",") + 1,
					this.getRangeInput().length() - 1);
		}
		return null;
	}

	public List<Integer> getResultRangeList() {
		List<Integer> resultRangeList = new ArrayList<>();
		Integer firstValue = Integer.valueOf(this.getFirstValue());
		Integer secondValue = Integer.valueOf(this.getSecondValue());
		for (Integer number : rangeList) {
			if (number >= firstValue && number <= secondValue) {
				resultRangeList.add(number);
			}
		}

		return resultRangeList;
	}

	public String getResult() {
		String result = "";
		List<Integer> resultRangeList = getResultRangeList();

		for (int i = 0; i < resultRangeList.size(); i++) {
			if (i == 0 && startWithExclude()) {
				continue;
			}
			if (i == resultRangeList.size() - 1 && endWithExclude()) {
				continue;
			}
			result = result + resultRangeList.get(i) + ",";
		}

		return deleteSuffixIfComma(result);
	}

	private String deleteSuffixIfComma(String result) {
		result = result.substring(0, result.length() - 1);
		return result;
	}

}
