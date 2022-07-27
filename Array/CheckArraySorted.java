import java.util.Scanner;
public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array: ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < size - 1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                System.out.println("UNSORTED");
            }
            else
            {
                System.out.println("SORTED");
            }
        }

     
    }
}
