
public class WorkingWithString {

    public static void main(String[] args) {
        String name = "Tonn";
        int age = 30;
        
        String result = name + " " + age;           // 1
        
        StringBuffer buffer = new StringBuffer();   // 2
        buffer.append(name).append(" ").append(age);
        
        StringBuilder builder = new StringBuilder();    // 3
        builder.append(name).append(" ").append(age);
        
        String result2 = String.format("%s %d", name, age); // 4
        
        System.out.println(result);
        System.out.println(buffer.toString());
        System.out.println(builder.toString());
        System.out.println(result2);
        
        int a = 0, b = 0, c = 0;
        System.out.println(String.format("%d %d %d", a, b, c));
        a = c++;
        System.out.println(String.format("%d %d %d", a, b, c));
        b = ++a;
        System.out.println(String.format("%d %d %d", a, b, c));
        c++;
        System.out.println(String.format("%d %d %d", a, b, c));
        b = ++c + a++;
        System.out.println(String.format("%d %d %d", a, b, c));
        a = --b + c++;
        System.out.println(String.format("%d %d %d", a, b, c));
    }

}
