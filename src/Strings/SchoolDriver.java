package Strings;

import java.util.Scanner;

public class SchoolDriver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        School s1=new School();
        boolean exit=true;
        while (exit){
            System.out.println("Enter choice \n1:AddStudent \n2:Remove Student \n3:Update Student \n4:Display Student");
            int choice= sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter Student Name");
                    String name= sc.next();
                    System.out.println("Enter Student ID");
                    int sID= sc.nextInt();
                    System.out.println("Enter Student standard");
                    int std= sc.nextInt();
                    System.out.println("Enter Student Percentage");
                    double percent= sc.nextDouble();
                    s1.addStudent(new Student(name,sID,std,percent));
                    break;

                case 2: {
                    s1.cancelAdmission();
                }
                    break;
                case 3: {
                    s1.updateStudent();
                }
                    break;
                case 4: {
                    s1.displayStudent();
                }
                    break;
                case 5:{
                    exit=false;
                }
                default:
                    System.out.println("Invalid choice");

            }
        }
    }
}
