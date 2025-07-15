import java.util.Scanner;
public class string_method {
   public static String method_to(String name){
        return "hello "+ name + " Welcome to VM";
    }
    public static void main(String[] args) {
      string_method s = new string_method();
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
        System.out.println(method_to(name));
    }

}
