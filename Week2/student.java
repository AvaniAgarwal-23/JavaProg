import java.util.*;
import java.util.function.Predicate;

class stud{
    String name;
    int marks;

    stud(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
    void show(){
        System.out.println(name+" - "+marks);
    }
}

public class student {
    public static void main(String[] args){
        ArrayList<stud> l = new ArrayList<>();

        l.add(new stud("Avani",85));
        l.add(new stud("Riya",65));
        l.add(new stud("Ankit",90));
        l.add(new stud("Priya",75));

        System.out.println("Original List");
        for(stud s : l){
            s.show();
        }
        l.sort((s1,s2) -> s1.name.compareTo(s2.name));
        System.out.println("\nSorted By Name");
        for(stud s : l){
            s.show();
        }

        l.sort((s1,s2) -> s2.marks-s1.marks);

        System.out.println("\nSorted By Marks");
        for(stud s : l){
            s.show();
        }
        Predicate<stud> p = s -> s.marks>75;

        System.out.println("\nStudents Scoring Above 75");
        for(stud s : l){
            if(p.test(s)){
                s.show();
            }
        }
    }
}