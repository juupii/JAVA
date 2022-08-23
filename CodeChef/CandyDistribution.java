import java.util.*;
public class CandyDistribution {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int t  = sc.nextInt();
    while(t-->0)
    {
        Float n = sc.nextFloat();
        Float m = sc.nextFloat();
        // n/m = c and c must be divisible by 2/even
        Float c = (n/m);
        if((c%2) == 0)
        {
         System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    sc.close();
    }
}
