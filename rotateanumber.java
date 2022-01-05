import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class rotateanumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scn.nextInt();
        System.out.println("Enter your no to rotate");
        int r = scn.nextInt();
        int a=num/(int)Math.pow(10,r);
        int b=num%(int)Math.pow(10.,r);
        System.out.print(b*(int)Math.pow(10,r)+a);


    }
}
