
import java.util.*;
class pppp {
    public static void main(String[] args) {
        // for pattern01
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter number");
        int n=scn.nextInt();
        int nsp=n-1; int nst=1;
        for(int i=1; i<=n; i++){
            for(int csp=1; csp<=nsp; csp++)
                System.out.print("\t");
                
            for(int cst=1; cst<=nst; cst++)
                System.out.print("*\t");
                nsp--;
                nst+=2;
            System.out.println();
            
        }

    }
}