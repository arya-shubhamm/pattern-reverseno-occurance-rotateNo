import java.util.*;
public class pattern13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = scn.nextInt();
        for(int i=0; i<=n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(n+"c"+j+"\t");
            }
        }
        
        System.out.println();
    }

}

