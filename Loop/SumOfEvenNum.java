import java.util.Scanner;
public class SumOfEvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum =0;
        for(int i = 0; i < num;i++)
        {
        System.out.println("The even numbers are "+2*i);
        
        sum = sum + (2*i);
        } 
        System.out.println("The sum is "+sum);
        
        sc.close();
    }
}
