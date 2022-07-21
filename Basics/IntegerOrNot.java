import java.util.Scanner;
public class IntegerOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        System.out.println(sc.hasNextInt());
        sc.close();
        
    }
    
}