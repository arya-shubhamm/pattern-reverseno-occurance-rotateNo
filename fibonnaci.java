import java.util.*;
public class fibonnaci {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("enter your number");
        int num=scn.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1; i<=num; i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
