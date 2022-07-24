import java.util.Scanner;
public class ReverseNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for(int i = num; i >= 0; i--)
        {
            System.out.println(i);
           
        }
        sc.close();
    }
}
