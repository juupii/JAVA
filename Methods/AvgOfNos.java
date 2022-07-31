import java.util.*;
public class AvgOfNos {
    static int sum(int ...arr)
    {
        int result = 0;
        for(int j : arr)
        {
          result = result + j;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter how many numbers you want to enter: ");
         int size = sc.nextInt();
         System.out.println("Enter the numbers: ");
         int[] num = new int[size];
         for(int i = 0; i < size;i++)
         {
            num[i] = sc.nextInt();
         }
         sum(num);
         System.out.println(sum(num));
        sc.close();
    }
}
