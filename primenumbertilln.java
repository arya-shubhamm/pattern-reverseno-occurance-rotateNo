import java.util.*;

public class primenumbertilln {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scn.nextInt();
        for(int i=1; i<=num; i++){
            int count=0;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    count++;
                }
            }if(count==0){
                System.out.print(i+" ");
            }
        }
    
        }
    }

