import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while(t>0)
    {
        int n = sc.nextInt();
        if(n % 2 == 0 || n % 7 == 0 || (2+7) <= n)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
      t--;    

    }
    
sc.close();
}
}