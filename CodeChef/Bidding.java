import java.util.Scanner;
public class Bidding{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int a =sc.nextInt();
            int b =sc.nextInt();
            int c =sc.nextInt();
            if(a>b && a>c)
            {
                System.out.println("ALICE");
            }
            else if(b>a && b>c)
            {
                System.out.println("BOB");
            }
            else
            {
                System.out.println("CHARLIE");
            }
        }
        sc.close();
    }
}