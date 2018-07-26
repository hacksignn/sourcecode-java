
public class FizzBuzz {

    public String sendAndReturn(int number) {
        String result = String.valueOf(number);

        if (divideableByBoth3And5(number)) {
            result = "FizzBuzz";
        } else if (divideableBy3(number)) {
            result = "Fizz";
        } else if (divideableBy5(number)) {
            result = "Buzz";
        }

        return result;
    }

    /**
     * @param number
     * @return Boolean
     */
    private boolean divideableByBoth3And5(int number) {
        return divideableBy3(number) && divideableBy5(number);
    }

    /**
     * @param number
     * @return Boolean
     */
    private boolean divideableBy5(int number) {
        return number % 5 == 0;
    }

    /**
     * @param number
     * @return Boolean
     */
    private boolean divideableBy3(int number) {
        return number % 3 == 0;
    }

}
