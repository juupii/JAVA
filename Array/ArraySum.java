import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        float[] arr = new float[size]; 
        System.out.println("Enter the array: ");
        float sum = 0;
        for (int i =0; i < size ;i++) {
            arr[i] = sc.nextFloat();
            sum = sum + arr[i];
            
        }
        System.out.println(sum);
        
        sc.close();
    }
}
