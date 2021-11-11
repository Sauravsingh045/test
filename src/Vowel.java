import java.util.Locale;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        int count=0;
        System.out.println("enter the string: ");
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }

        }System.out.println("there are"+ count + "vowel");



    }
}
