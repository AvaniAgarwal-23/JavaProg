import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}
public class excep{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        try {
            if(n<18){
                throw new InvalidAgeException("Not eligible");
            }
            else{
                System.out.println("Eligible");
            }
        } 
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}