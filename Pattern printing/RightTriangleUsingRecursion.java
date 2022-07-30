import java.util.*;
public class RightTriangleUsingRecursion { 
   static void StarPattern(int a)
    {
        if( a > 0)
       {
        StarPattern( a - 1);
        for(int j = 0; j < a; j++ )
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        StarPattern(num);
    }
}