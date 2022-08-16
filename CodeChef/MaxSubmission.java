import java.util.Scanner;

public class MaxSubmission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        while(t-->0)
        {
            int x = sc.nextInt();
            for(int i = 0; i <= x; i++)
            {
                int  z = 2*x;
                System.out.println(z);
            }

        }
        sc.close();
        
    }
}
