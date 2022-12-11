package Strings;

import java.util.Scanner;

public class School {
    Student s;
    Scanner sc=new Scanner(System.in);

    public void addStudent(Student s){
        this.s=s;
        System.out.println("Student Admission is Successful");
    }
    public void cancelAdmission(){
        if(this.s == null){
            System.out.println("no student to remove");
        }
        else{
            this.s=null;
            System.out.println("Admission cancels...");
        }
    }
    public void updateStudent(){
        if(this.s==null){
            System.out.println("NO Student to update");
        }
        else{
            System.out.println("Enter the Standard to update");
            int std= sc.nextInt();
            s.setStd(std);
            System.out.println("Enter percent to update");
            double percent= sc.nextDouble();
            s.setPercent(percent);
            System.out.println("Successfully updated");
        }
    }
    public void displayStudent(){
        if(this.s==null){
            System.out.println("No student to display");
        }
        else{
            System.out.println("Student Name:"+s.getName());
            System.out.println("Student ID:"+s.getsID());
            System.out.println("Student Std:"+s.getStd());
            System.out.println("Student Percent"+s.getpercent());
        }

    }
}
