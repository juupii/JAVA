import java.util.*;

public class SaleSeason {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int x = sc.nextInt();
            if(x <= 100)
            {
                System.out.println(x);
            }
            else if(x <=1000)
            {
                x = x - 25;
                System.out.println(x);
            }
            else if(x <= 5000)
            {
                x = x - 100;
                System.out.println(x);
            }
            else if(x > 5000)
            {
                x = x - 500;
                System.out.println(x);
            }
        }
    }
}
