import java.util.Scanner;;
public class KilometerToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in kilometer: ");
        int distance = sc.nextInt();
        double Miles = distance * 0.6214;
        System.out.println("Distance in miles is "+Miles);
        sc.close();        
    }
}
