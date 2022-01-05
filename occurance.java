import java.util.*;
public class occurance {
    public static int main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scn.nextInt();
        System.out.print("enter second number");
        int d=scn.nextInt();
        int occur=0;
        while(num>0){
            int rem=num%10;
           num= num/10;
           if(rem==d);
           occur++;

        }
        return occur;
  }  
} 