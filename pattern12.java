import java.util.*;

public class pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            int count;
            for (int cst = 1; cst <= i; cst++) {
                System.out.print(a + "\t");
                int sum = a + b;
                a = b;
                b = sum;
            }
            System.out.println();
        }
    }
}
