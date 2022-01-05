import java.util.*;
public class arya
{
	public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter a number");
     int num=scn.nextInt();
     int count=0;
     for(int i=1; i<=num ; i++){
         if(num%i==0){
             count++;
         }
     }if(count==2){
         System.out.print("no is prime");
     }else{
         System.out.print("no is not prime");
     }
	}
}

