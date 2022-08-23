import java.util.*;

public class TestAverages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if((a+b)/2 >= 35 && (b+c)/2>=35 && (c+a)/2>=35 )
            {
                System.out.println("PASS");
            }
            else
            {
                System.out.println("FAIL");
            }
        }
    }
}
