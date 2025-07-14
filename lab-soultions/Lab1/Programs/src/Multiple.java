public class Multiple {
    public void multiplication_for(int num){
        System.out.println("table using for loop");
        for(int i=1;i<=10;i++){
            System.out.println(num +"x" + i  + "=" + num*i);
        }
    }
    public void multiplication_while(int num){
        System.out.println("table using while loop");
        int i=1;
        while(i <= 10){
            System.out.println(num +"x" + i  + "=" + num*i);
            i++;
        }
    }
    public void multiplication_dowhile(int num){
        System.out.println("table using while loop");
        int i=1;
        do{
            System.out.println(num +"x" + i  + "=" + num*i);
            i++;
        }while(i<=10);
    }

    public static void main(String[] args) {
        Multiple m =new Multiple();
//        m.multiplication_for(1);
//        m.multiplication_while(2);
        m.multiplication_dowhile(3);
    }
}
