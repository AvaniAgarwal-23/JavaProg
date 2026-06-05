import java.util.*;
class pairing<T,U>{
    T first;
    U second;
    pairing(T first, U second){
        this.first=first;
        this.second=second;
    }
    public static<T,U extends Comparable<U>> void sort(ArrayList<pairing<T,U>> list){
        list.sort((p1,p2)->p2.second.compareTo(p1.second));
        System.out.println("top 3 students marks are: ");
        for(int i=0;i<3;i++){
            System.out.println(list.get(i).first+ " "+list.get(i).second);
        }
    }
}
public class genric {
    public static void main(String[] args) {
        pairing<String,Integer> p1=new pairing<>("sidd", 85);
        pairing<String,Integer> p2=new pairing<>("rahul", 95);
        pairing<String,Integer> p3=new pairing<>("sangeeta", 90);
        pairing<String,Integer> p4=new pairing<>("avani", 80);
        ArrayList<pairing<String,Integer>> list =new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        pairing.sort(list);
    }
}
