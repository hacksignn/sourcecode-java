
public class WorkingWithLoop {

    public static void main(String[] args) {
        int resultWithFor = 0;
        for (int i = 1; i <= 10; i++) {
            int oldResult = resultWithFor;
            resultWithFor = oldResult + i;
            System.out.println(String.format("%d + %d = %d", oldResult, i, resultWithFor));
        }
        System.out.println(resultWithFor);
        
        int resultWithWhile = 0;
        int whileCount = 1;
        while (whileCount <= 10) {
            resultWithWhile = resultWithWhile + whileCount;
            whileCount++;
        }
        System.out.println(resultWithWhile);
        
        int resultWithDoWhile = 0;
        int doWhileCount = 0;
        do {
            doWhileCount++;
            resultWithDoWhile = resultWithDoWhile + doWhileCount;
        } while (doWhileCount < 10); 
        System.out.println(resultWithDoWhile);
    }

}
