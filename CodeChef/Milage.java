import java.util.Scanner;

public class Milage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            float x = sc.nextFloat();
            float y = sc.nextFloat();
            int a = sc.nextInt();
            int b = sc.nextInt();
            float petrol = (x/a)*n;
            float diesel = (x/b)*n;
            if(petrol > diesel)
            {
                System.out.println("DIESEL");
            }
            else if(diesel > petrol)
            {
                System.out.println("PETROL");
            }
            else if(petrol == diesel)
            System.out.println("ANY");
        }
        sc.close();
    }
}
//(x%a)*n;(x%b)*n