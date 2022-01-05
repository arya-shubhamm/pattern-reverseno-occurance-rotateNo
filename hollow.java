import java.util.*;
public class hollow {
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter your number");
    int num=scn.nextInt();
    if (num % 2 == 0) {
        num++;
    }
    int nsp = 1, nst = num / 2;
    for (int r = 1; r <= num; r++) {
        // stars
        for (int cst = 1; cst <= nst; cst++) {
            System.out.print("*\t");
        }
        // spaces
        for (int csp = 1; csp <= nsp; csp++) {
            System.out.print("\t");
        }
        // stars
        for (int cst = 1; cst <= nst; cst++) {
            System.out.print("*\t");
        }
        if (r <= num / 2) {
            nst--;
            nsp += 2;
        } else {
            nst++;
            nsp -= 2;
        }
        System.out.println();
        }
    }


    }


