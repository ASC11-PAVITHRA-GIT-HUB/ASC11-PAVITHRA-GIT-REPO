
package collections;
import java.util.ArrayList;

public class ArrayListEx  {
    public static void main(String[] args) {
       genericTypes();
//       rawType();
 }
// rawType
//    private static void rawTypes(){
//         ArrayList colorsList = new ArrayList();
//         colorsList.add("Red");
//         colorsList.add(null);
//         colorsList.add("Blue");
//         ArithmeticException ar = new ArithmeticException("Sample Exception");
//         colorsList.add(ar);
//        System.out.println(colorsList);


//    Generic method
private static void genericTypes(){
    ArrayList<String> colorsList = new ArrayList<String>();
    colorsList.add("Red");
    colorsList.add(null);
    colorsList.add("Blue");
    ArithmeticException ar = new ArithmeticException("Sample Exception");
//    colorsList.add(ar);
    System.out.println(colorsList);
    ArrayList<Integer> intergersList = new ArrayList<Integer>();
    intergersList.add(10);
    intergersList.add(20);
    intergersList.add(null);
    System.out.println(intergersList);
    ArrayList<Number> numbersList = new ArrayList<Number>();
    numbersList.add(3);
    numbersList.add(3.5);
    numbersList.add(3.05f);
    numbersList.add(null);
    System.out.println(numbersList);
}


}
