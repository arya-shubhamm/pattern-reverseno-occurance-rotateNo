
import java.util.*;

public class pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your Number");
        int n = scn.nextInt();
        int nst = 1, nsp = 2 * n - 3;

        for (int r = 1; r <= n; r++) {
            int count = 1;
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count + "\t");
            }

            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            if (r == n)
                nst--;
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count + "\t");
            }

            nst++;
            nsp -= 2;
            System.out.println();
        }
    }
}
