import java.util.Scanner;
public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the Array: ");
        int[] arr = new int[size];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        
        
        if(arr[i] > max)
        {
          max = arr[i];
        }
   }
System.out.println(max);
    }
}
