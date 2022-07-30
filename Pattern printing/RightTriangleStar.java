import java.util.*;

public class RightTriangleStar {
    static void StarPattern(int a)
    {
        for(int i = 0; i < a; i++)
       {
        for(int j = 0; j < i+1; j++ )
            {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        StarPattern(num);
    }
}
