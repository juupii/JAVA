import java.util.*;
public class SumOfNaturalNo {
    static int sum(int a)
    {
        if(a == 1)
        {
            return 1;
        }
            return a + sum(a-1);
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sum(num);
        System.out.println(sum(num));
        sc.close();
    }
}
