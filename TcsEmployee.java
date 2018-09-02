import java.lang.*;
import java.util.*;

class TcsEmployee{

  public int getHighScores(TcsTrainee tt[],String batch){
      int highscore=tt[0].getPS1Score();

        for (int i=0;i<tt.length;i++) {
          if(tt[i].getBatchName().equalsIgnoreCase(batch)){
            if(tt[i].getPS1Score()>highscore){
              highscore=tt[i].getPS1Score();
          }
        }
      }
      return highscore;

  }
  public int totalTraineeScores(TcsTrainee tt[],String batches){
    int sum=0;
    for(int i=0;i<tt.length;i++){
      if(tt[i].getBatchName().equalsIgnoreCase(batches)){
          sum=sum+tt[i].getPS1Score();
      }
    }
    return sum;

  }
  public String getBaseLocations(TcsTrainee tt[],int EmpId ){
    String location="No location";
    for(int i=0;i<tt.length;i++){
      if(tt[i].getEmpId()==EmpId){
        location=tt[i].getBaseLocation();
      }
    }
    return location;
  }
  public void getDetails(TcsTrainee tt[], String BaseLocation){

    for(int i=0;i<tt.length;i++){
      String s=tt[i].getBaseLocation();
        if(s.equalsIgnoreCase(BaseLocation)){
          System.out.println(tt[i].getEmpId());
           System.out.println(tt[i].getEmpName());
           System.out.println(tt[i].getBatchName());
           System.out.println(tt[i].getLearningGrp());
           System.out.println(tt[i].getPS1Score());
        }
      }
  }

}
