/*Create array of object of class Student_Detail 
with attributes Enrollment_no, Name, Sem, CPI
 for 5 students, scan their information and 
 print it. (Home Work)*/

 import java.util.Scanner;

public class StudentDemo{
    public static void main(String[] args) {
            Student_Details s1=new Student_Details();
            s1.getdetail();
            s1.printdetail();
    }
}



class Student_Details{
        int n=5;
        double Enrollment_no[]=new double[n];
        String Name[]=new String[n]; 
        int Sem[]=new int[n];
        float Cpi[]=new float[n];


        void getdetail(){
            for(int i=0;i<n;i++)
            {
                Scanner sc=new Scanner(System.in);

                System.out.println("Enter Enrollment_no:");
                Enrollment_no[i]=sc.nextDouble();

                System.out.println("Enter Name");
                Name[i]=sc.next();

                System.out.println("Enter Sem:");
                Sem[i]=sc.nextInt();

                System.out.println("Enter CPI");
                Cpi[i]=sc.nextFloat();
            }
        }


        void printdetail(){
            for(int i=0;i<n;i++)
            {
                System.out.println("Enrollment_no is: "+Enrollment_no);
                System.out.println("Name is: "+Name);
                System.out.println("Sem is: "+Sem);
                System.out.println("CPI is: "+Cpi);
            }
        }
}