import java.util.Scanner;
class Student{
    String name;
    int rollNo;
    int marks1;
    int marks2;
    int marks3;
    Student(String name,int rollNo,int marks1,int marks2,int marks3){
        this.name=name;
        this.rollNo=rollNo;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }
    double calculateAverage(){
        return (marks1+marks2+marks3)/3.0;
    }
    String getGrade(){
        double avg=calculateAverage();
        if(avg>=90)
            return "A";
        else if(avg>=70)
            return "B";
        else if(avg>=55)
            return "C";
        else if(avg>=40)
            return "D";
        else
            return "F";
    }
    void display(){
        System.out.println("Name = " + name);
        System.out.println("Roll No = " + rollNo);
        System.out.println("Marks 1 = " + marks1);
        System.out.println("Marks 2 = " + marks2);
        System.out.println("Marks 3 = " + marks3);
        System.out.println("Average = " + calculateAverage());
        System.out.println("Grade = " + getGrade());
    }
}

public class week1assign {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students in total: ");
        int n=sc.nextInt();
        Student[] students=new Student[n];
        int count=0;
        while(true) {

            System.out.println(" ------- Student Management System -------");
            System.out.println("|           1. Add Student                |");
            System.out.println("|        2. Display All Students          |");
            System.out.println("|     3. Search Student by Roll Number    |");
            System.out.println("|               4. Exit                   |");
            System.out.println(" -----------------------------------------");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:

                    System.out.print("Enter Name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter Roll Number: ");
                    int rollNo=sc.nextInt();
                    System.out.print("Enter Marks in Subject 1: ");
                    int m1=sc.nextInt();
                    System.out.print("Enter Marks in Subject 2: ");
                    int m2=sc.nextInt();
                    System.out.print("Enter Marks in Subject 3: ");
                    int m3=sc.nextInt();
                    students[count]=new Student(name, rollNo, m1, m2, m3);

                    count++;
                    System.out.println("Student Added Successfully");
                    break;
                case 2:

                    if(count==0) {
                        System.out.println("No Students Found");
                    }
                    else {
                        for(int i=0; i<count; i++) {
                            System.out.println();
                            students[i].display();
                        }
                    }
                    break;
                case 3:

                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll=sc.nextInt();
                    boolean found=false;
                    for(int i=0; i<count; i++) {
                        if(students[i].rollNo==searchRoll) {
                            students[i].display();
                            found=true;
                            break;
                        }
                    }
                    if(!found) {
                        System.out.println("Student Not Found");
                    }
                    break;
                case 4:

                    System.out.println("Exiting Program");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}