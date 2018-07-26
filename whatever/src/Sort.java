
public class Sort {

    public int[] of(int[] input) {
//        int[] sortInput = new int[input.length];
//        if (input.length == 2 && input[0] > input[1]) {
//            int tmp = input[0];
//            input[0] = input[1];
//            input[1] = tmp;
//        }
//        
//        if (input.length == 3) {
//            if (input[0] > input[1]) {
//                int tmp = input[0];
//                input[0] = input[1];
//                input[1] = tmp;
//            }
//            
//            if (input[0] > input[2]) {
//                int tmp = input[0];
//                input[0] = input[2];
//                input[2] = tmp;
//            }
//            
//            if (input[1] > input[2]) {
//                int tmp = input[1];
//                input[1] = input[2];
//                input[2] = tmp;
//            }
//        }
//        if (input.length == 1) {
//            
//        } else {
//            for (int i = 0; i < input.length - 1; i++) {
//                    if (input[i] > input[i+1]) {
//                        int tmp = input[i];
//                        input[i] = input[i+1];
//                        input[i+1] = tmp;
//                        System.out.println(input[0] + ", " + input[1] + ", " + input[2] + ", " + input[3] + ", " + input[4]);
//                    }
//                System.out.println("end round" + i);
//            }
//            
//        }
//        System.out.println(input[0] + ", " + input[1] + ", " + input[2] + ", " + input[3] + ", " + input[4]);
//        
//        

        int count = 1;
        while (count > 0) {
            count = 0;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    count++;
                }
            }
        }

        return input;
    }

}
