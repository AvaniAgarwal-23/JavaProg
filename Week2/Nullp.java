import java.util.*;
import java.util.stream.Collectors;
class stud{
    String name;
    int marks;
    stud(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    String getGrade(){
        if(marks>=90)
            return "A";
        else if(marks>=80)
            return "B";
        else if(marks>=70)
            return "C";
        else
            return "D";
    }
    void show(){
        System.out.println(name+" - "+marks+" - Grade "+getGrade());
    }
}

public class Nullp {
    public static void main(String[] args){
        ArrayList<stud> l = new ArrayList<>();
        l.add(new stud("Avani",85));
        l.add(new stud("Riya",65));
        l.add(new stud("Ankit",95));
        l.add(new stud("Priya",75));
        l.add(new stud("Rahul",40));

        System.out.println("Original List");
        l.forEach(stud::show);
        System.out.println("Sorted By Name");
        l.stream().sorted((s1,s2)->s1.name.compareTo(s2.name)).forEach(stud::show);

        System.out.println("Top 3 Students By Marks");
        l.stream().sorted((s1,s2)->s2.marks-s1.marks).limit(3).forEach(stud::show);

        double avg = l.stream().mapToInt(s->s.marks).average().getAsDouble();
        System.out.println("Average Marks: "+avg);

        Map<String,List<stud>> gradeMap =l.stream().collect(Collectors.groupingBy(stud::getGrade));
        System.out.println("Grouped By Grade");
        for(String grade : gradeMap.keySet()){
            System.out.println("Grade "+grade);
            for(stud s : gradeMap.get(grade)){
                s.show();
            }
            System.out.println();
        }
        //null pointer
        stud st=null;
        Optional<stud> op =Optional.ofNullable(st);
        String result=op.map(x->x.name).orElse("unknown");
        System.out.println(result);
    }
}