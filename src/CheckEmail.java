import java.util.Scanner;

public class CheckEmail {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
int a=s.lastIndexOf("in");
int b=s.lastIndexOf("ac");

if(a==-1& b==-1){
        System.out.println("this email is not from India");
    System.out.println("this email is not from academic ");
    }else if(a==-1||b==-1){
    System.out.println("this email is not valid");
    }

else{
    System.out.println("this email is from India");
    System.out.println("this email is from Academics");
}



    }
}
