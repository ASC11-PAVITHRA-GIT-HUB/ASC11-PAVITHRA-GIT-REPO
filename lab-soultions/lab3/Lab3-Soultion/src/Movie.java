import java.util.Scanner;
public class Movie {
    String movieName;
    String producedBy;
    String directedBy;
    int duration;
    int year;
    String category;
    Movie(String movieName, String producedBy){
        if(movieName == null || producedBy == null){
            throw new IllegalArgumentException("Movie Name and Producer Names are Mandatory");
        }
        this.movieName=movieName;
        this.producedBy=producedBy;
    }
    Movie(String movieName,String producedBy,String directedBy,int duration,int year,String category){
        this.movieName = movieName;
        this.producedBy = producedBy;
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category=category;

    }
//    Movie(String movieName,String )
    void inputMethod(String movieName,String producedBy,String directedBy,int duration,int year) {
    this.movieName = movieName;
    this.producedBy = producedBy;
    this.directedBy = directedBy;
    this.duration = duration;
    this.year = year;
}
void displayMethod(){
    System.out.println("Movie Name: "+movieName+ "\nProduced By: " +producedBy+ "\nDirected By:" +directedBy+ "\nDuration: " +duration+"\nYear:"+year);
}
    public static void main(String[] args) {
        System.out.println("Output for all attributes in the Constructor:");
       Movie m = new Movie("Bhahubhali","Ram","Rajamoli",3,2019,"action");
       m.displayMethod();
        System.out.println("Output for only two attributes in the Constructor:");
       Movie m1 =new Movie("Chavva","Vijan");
       m1.displayMethod();
        System.out.println("Output for all attributes input and output methods:");
       m1.inputMethod("RRR","Ram","Rajamoli",3,2022);
       m1.displayMethod();
//        Movie m = new Movie(,,"Rajamoli",3,2019,"action");







    }


}
