import java.util.Scanner;
public class prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        boolean b=true;
        if(n<=0){
            b=false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                b=false;
                break;
            }
        }
        if(b){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
        sc.close();
    }
}
