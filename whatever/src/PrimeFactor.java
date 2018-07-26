
public class PrimeFactor {

    public String of(int inputNumber) {
//        int tmpNumber = inputNumber;
//        int[] primeNumbers = { 2, 3, 5 };
//        String result = "";
//
//        while (tmpNumber != 1) {
//            for (int primeNumber : primeNumbers) {
//                if (tmpNumber % primeNumber == 0) {
//                    if (result.isEmpty()) {
//                        result = result + primeNumber;
//                    } else {
//                        result = result + ", " + primeNumber;
//                    }
////                    result = result + primeNumber;
//                    tmpNumber = tmpNumber / primeNumber;
////                    System.out.println(tmpNumber + " " + primeNumber);
//                    break;
//                }
//            }
//        }
        
        String result = "";
//        while (inputNumber % 2 == 0) {
//            result = result + 2;
//            inputNumber = inputNumber / 2;
//        }
//        while (inputNumber % 3 == 0) {
//            result = result + 3;
//            inputNumber = inputNumber / 3;
//        }
//        while (inputNumber % 5 == 0) {
//            result = result + 5;
//            inputNumber = inputNumber / 5;
//        }
        
        int thePrimeNumber = 2;
        while (inputNumber > 1) {
            while (inputNumber % thePrimeNumber == 0) {
                result = result + thePrimeNumber;
                inputNumber = inputNumber / thePrimeNumber;
            }
            thePrimeNumber++;
        }
       
        return result;
    }

}
