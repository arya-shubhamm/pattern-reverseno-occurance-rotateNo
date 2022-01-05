import java.util.*;

public class diamond {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scn.nextInt();
        int nst=1; int nsp=num/2;
        for(int i=1; i<=num; i++){
            for(int csp=1; csp<=nsp; csp++){
                System.out.print("\t");
            }for(int cst=1; cst<=nst; cst++){
                System.out.print("*\t");
            }if(i<=num/2){
                nst=nst+2;
                nsp--;

            }else{
                nst=nst-2;
                nsp++;
            }
            System.out.println();
        }
    }
}
