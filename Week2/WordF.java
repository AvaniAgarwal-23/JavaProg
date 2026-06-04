import java.util.*;
public class WordF {
     public static void main(String[] args) {
    String sentence = "apple mango apple banana mango apple";
    HashMap<String, Integer> a= new HashMap<>();
    String[] words = sentence.split(" ");

    for(String x : words){
        if(a.containsKey(x)){
            a.put(x,a.get(x)+1);
        }
        else{
            a.put(x,1);
        }
    }
    System.out.println(a);
}
}