class Student{
    String name;
    int rollNo;
    int marks;

    Student(String name,int rollNo,int marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }

    void display(){
        System.out.println("Name = "+this.name);
        System.out.println("Roll No = "+this.rollNo);
        System.out.println("Marks = "+this.marks);
    }

    void getGrade(){
        if(this.marks>=90)
            System.out.println("Grade A");
        else if(this.marks>=80)
            System.out.println("Grade B");
        else if(this.marks>=70)
            System.out.println("Grade C");
        else
            System.out.println("Fail");
    }
}

public class multi{
    public static void main(String[] args){
        Student s1=new Student("Avani", 1, 92);
        Student s2=new Student("Rahul", 2, 76);
        s1.display();
        s1.getGrade();
        System.out.println();
        s2.display();
        s2.getGrade();
    }
}