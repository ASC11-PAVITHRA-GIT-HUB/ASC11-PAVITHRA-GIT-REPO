public class Method_Overloading {
   public int add(int a, int b){
        return a+b ;
    }
   public double add(double a, double b){
        return a+b ;
    }
   public int add(int a, int b,int c){
        return a+b+c ;
    }
   public String add(String a, int b){
        return a+b ;
    }


    public static void main(String args[]){
        Method_Overloading m =new Method_Overloading();
        System.out.println(m.add(5,10));
        System.out.println(m.add(1,2,3));
        System.out.println(m.add(3.4,4.5));
        System.out.println(m.add("hello",5));


    }
}
