
public class WorkingWithStringLoop {

    public static void main(String[] args) {
        String name = "asdfghjk;";
        for (int i = 0; i < name.length() - 1; i++) {
//            System.out.println(name.charAt(i));
//            System.out.println(name.substring(i, i + 1));
        }
        while (name.length() > 0) {
            System.out.println(name.substring(0, 1));
            name = name.substring(1);
        }
    }

}
