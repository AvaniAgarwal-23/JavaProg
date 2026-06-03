import java.util.Scanner;
public class palin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter: ");
        String s=sc.nextLine();
        String a="";
        for(int i=s.length()-1;i>=0;i--){
            a+=s.charAt(i);
        }
        if(a.equals(s)){
            System.out.println("It is Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        sc.close();
    } 
}
