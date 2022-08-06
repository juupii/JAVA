import java.util.Scanner;

public class PassTheExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for(int i=0; i<t; i++)
        {
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c= sc.nextInt();
          int total = a+b+c;
          if(total >= 100 && a >= 10 && b >= 10 && c >= 10 )
          {
            System.out.println("PASS");
          }
          else
          {
            System.out.println("FAIL");
          }
        }
        sc.close();
    }
}
