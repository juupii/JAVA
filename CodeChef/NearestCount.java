import java.util.*;

public class NearestCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = (x+y)/2;
            if(x>z)
            {
                System.out.println(x-z);
            }
            else
            System.out.println(y-z);
            
            
        }
        sc.close();
    }
}
