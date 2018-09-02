import java.lang.*;
import java.util.*;

class TcsTrainee{
  private String EmpName;
  private int EmpId;
  private String BatchName;
  private String LearningGrp;
  private int PS1Score;
  private String BaseLocation;

    TcsTrainee(int EmpId,String EmpName,String BaseLocation,String BatchName,String LearningGrp,int PS1Score){
      this.EmpId=EmpId;
      this.EmpName=EmpName;
      this.BaseLocation=BaseLocation;
      this.BatchName=BatchName;
      this.LearningGrp=LearningGrp;
      this.PS1Score=PS1Score;

  }
  //getter
  public  int getEmpId(){
    return EmpId;
  }
  public String getEmpName(){
    return EmpName;
  }
  public  String getBatchName(){
    return BatchName;
  }
  public String getLearningGrp(){
    return LearningGrp;
  }
  public  int getPS1Score(){
    return PS1Score;
  }
  public  String getBaseLocation(){
    return BaseLocation;
  }

  //setter
  public void setEmpId(int EmpId){
    this.EmpId=EmpId;
  }
  public void setEmpName(String EmpName){
    this.EmpName=EmpName;
  }
  public void setBatchName(String BatchName){
    this.BatchName=BatchName;
  }
  public void setLearningGrp(String LearningGrp){
    this.LearningGrp=LearningGrp;
  }
  public void setPS1Score(int PS1Score){
    this.PS1Score=PS1Score;
  }
  public void setBaseLocation(String BaseLocation){
    this.BaseLocation=BaseLocation;
  }


}
