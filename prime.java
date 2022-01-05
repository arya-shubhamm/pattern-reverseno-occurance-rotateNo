import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scn.nextInt();
        int count=0;
        for(int i=1; i<=num; i++){

        
        if(num%i==0){
            count++;
        }
        
        }if(count==2){
            System.out.print("number prime");
        }else{
            System.out.print(" not prime");
        }
    }
}

