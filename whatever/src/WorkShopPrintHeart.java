
public class WorkShopPrintHeart {

    public static void main(String[] args) {
        int startStar = 9;
//        line 1
        System.out.println(" **   **");
//        line 2
        for (int i = 0; i < 9; i++) {
            if (i == startStar / 2) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println(" ");

//        line 3-7
        for (int round = 0; round < 5; round++) {
            generateSpace(round);
            generateStar(startStar);
            newLine();
            startStar = startStar - 2;
        }

    }

    /**
     * 
     */
    private static void newLine() {
        System.out.println();
    }

    /**
     * @param startStar
     */
    private static void generateStar(int startStar) {
        for (int k = 0; k < startStar; k++) {
            System.out.print("*");
        }
    }

    /**
     * @param round
     */
    private static void generateSpace(int round) {
        for (int j = 0; j < round; j++) {
            System.out.print(" ");
        }
    }

}
