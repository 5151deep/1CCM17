package Strings;

public class Student {
    private String name;
    private int sID;
    private int std;
    private double percent;

    public Student(String name,int sID,int std,double percent){
        this.name=name;
        this.sID=sID;
        this.std=std;
        this.percent=percent;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){

        this.name=name;
    }
    public int getsID(){
        return sID;
    }
    public void setsID(){
        this.sID=sID;
    }
    public int getStd(){
        return std;
    }
    public void setStd(int std){
        this.std= this.std;
    }

    public double getpercent() {
        return percent;
    }
    public void setPercent(double percent) {
        this.percent=percent;

    }
}
