import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}
class bankacc{
    int n;
    bankacc(int n){
        this.n=n;
    }
    void wd (int x, int y) throws InsufficientBalanceException,InvalidAgeException{
        if(n<18){
                throw new InvalidAgeException("Not eligible");
            }
        if(x>y){
            throw new InsufficientBalanceException("balance cant be -ve");
        }
        y-=x;
        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: "+y);
    } 
}
public class bank{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age: ");
        int n=sc.nextInt();
        int y=100;
        System.out.println("Enter the money u want to take out : ");
        int x=sc.nextInt();
        bankacc acc=new bankacc(n);
        try {
           acc.wd(x,y);
        } 
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}