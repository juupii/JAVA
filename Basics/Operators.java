import java.util.*;
public class  Operators{


    public static void main(String[] args)
    { Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        int sum=a+b;
        int mult=a*b;
        int sub=a-b;
        int div=a/b;
        int rem=a%b;

        System.out.println("The output is" +sum+ " " +mult+ " " +sub+" "  +div+" "  +rem+" ");
       


    }
}

