import java.util.*;

public class lists{
    public static void main(String[] args) {
        LinkedList<Integer> student = new LinkedList<>();
        LinkedList<Integer> LList = new LinkedList<>();
        ArrayList<Integer> LArray = new ArrayList<>();
    
        student.add(10);
        student.add(20);
        student.add(30);
        student.add(40);
        student.remove(1);
        student.set(0,20);

        Iterator<Integer> it = student.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        long insert = System.nanoTime();
        for(int i=0;i<1000;i++){
            LList.add(i);
        }
        long end = System.nanoTime();
        System.out.println("LinkedList Insertion time: "+(end-insert)+"ns");
        long Ainsert = System.nanoTime();
        for(int i=0;i<1000;i++){
            LArray.add(i);
        }
        long Aend = System.nanoTime();
        System.out.println("ArrayList Insertion time: "+(Aend-Ainsert)+"ns");
        long ts = System.nanoTime();
        for(int i=0;i<1000;i++){
            LList.get(i);
        }
        long te = System.nanoTime();
        System.out.println("LinkedList time accessing: "+(te-ts)+"ns");

        long st = System.nanoTime();
        for(int i=0;i<1000;i++){
            LArray.get(i);
        }
        long ed = System.nanoTime();
        System.out.println("ArrayList time accessing: "+(ed-st)+"ns");
    }
}