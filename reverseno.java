import java.util.*;

public class reverseno {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your Number");
        int num = scn.nextInt();
        int count = 0;
        while (num != 0) {
            int dig = num % 10;
            count = count * 10 + dig;
            num = num / 10;
        }
        System.out.print(count);
    }
}
