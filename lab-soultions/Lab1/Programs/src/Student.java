public class Student {
    public float getAnnualFee(float feePerMonth){
        return feePerMonth*12;
    }
    public int getTotalMarks(int m1,int m2,int m3){
      return (m1+m2+m3);
    }
    public float getAverage(int m1,int m2,int m3){
        return (m1+m2+m3)/3;
    }
    public String getResult(int m1,int m2,int m3){
        if(m1 >=60 && m2 >=60 && m3 >=60){
            return "pass";
        }
        return "fail";
    }
    public void setm1(int m1){
//        t=m1;
    }

       private int studId , marks1,marks2,marks3;
       private String studentName,city;
        private float feePerMonth;
       private  boolean isEligibleforScholership;



}
