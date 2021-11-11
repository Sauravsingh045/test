import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class StingAreEqualOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two string:");
        String s= sc.nextLine();
        String s1=sc.nextLine();
        boolean a=s.equalsIgnoreCase(s1);
        if(a==true) {
            System.out.println("they are equal");
        }
        else{
            System.out.println("they are not equal");
        }



    }
}
