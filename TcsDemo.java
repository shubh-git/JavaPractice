import java.util.*;
import java.lang.*;

class TcsDemo{
  public static void main(String[] args) {
    TcsTrainee tt[]=new TcsTrainee[6];
    tt[0]=new TcsTrainee(100 , "Ayushi"  , "Trivandrum" , "TJA86" , "Java" , 80);
    tt[1]=new TcsTrainee(102 , "Anamika" , "Chennai" , "CHN30" , "Java" , 75);
    tt[2]=new TcsTrainee(104 , "Zakhir" , "Chennai" , "CHN30" , "Java" , 90);
    tt[3]=new TcsTrainee(108 , "Aman" , "Trivandrum" , "TJA86", "Java" , 50);
    tt[4]=new TcsTrainee(110 , "Nikita" , "Trivandrum" , "TJA30" , "Java" , 60);
    tt[5]=new TcsTrainee(112 , "Rachana" , "Chennai" , "CHN30" , "Java" , 70);

    TcsEmployee te=new TcsEmployee();
    System.out.println("Choose any option");
    Scanner sc=new Scanner(System.in);
    int op=sc.nextInt();
    switch(op){
      case 1:System.out.println("You have choosed for: getHighScores");
             System.out.println("Please Enter your BatchName:");
             String n=sc.next();
             int ans=te.getHighScores(tt,n);
             System.out.println(ans);
              break;
      case 2:System.out.println("You have choosed for: totalTraineeScores");
             System.out.println("Please Enter your BatchName:");
             String n1=sc.next();
             int ans1=te.totalTraineeScores(tt,n1);
             System.out.println(ans1);
              break;
      case 3:System.out.println("You have choosed for: getBaseLocations");
             System.out.println("Please Enter your EmpId:");
             int n2=sc.nextInt();
             String ans2=te.getBaseLocations(tt,n2);
             System.out.println(ans2);
              break;

    case 4:System.out.println("You have choosed for: getDetails");
           System.out.println("Enter your Location:");
           String n3=sc.next();
           te.getDetails(tt,n3);
            break;
    }

  }
}
