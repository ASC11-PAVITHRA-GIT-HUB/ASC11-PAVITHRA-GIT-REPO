import java.util.Scanner;
public class largest_3no {
    public static int largest_of_3(int a, int b,int c){
        return Math.max(a,Math.max(b,c));
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter the 3 numbers:");
    a= sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
        System.out.println("Largest of three numbers:" +largest_of_3(a,b,c));
    }
}
