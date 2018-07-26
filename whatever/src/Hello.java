public class Hello {

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.say(100);
    }
    
//    Constant
    private static final int NUMBER_TWO =2;
//    class variable
    public static int index = 1;
    
//    Instance variable
    private int number = 3;

    private void say(int number) {
        int index = 0;
        System.out.println(index);          // 0
        System.out.println(this.index);     // 1
        System.out.println(Hello.index);    // 1
        System.out.println(number);         // 100
        System.out.println(this.number);    // 3
        System.out.println(NUMBER_TWO);     // 2
    }

}
