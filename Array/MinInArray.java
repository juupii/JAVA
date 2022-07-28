import java.util.Scanner;
public class MinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the Array: ");
        int[] arr = new int[size];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        
        
        if(arr[i] < min)
        {
          min = arr[i];
        }
        //System.out.println(min);
   }
   System.out.println("The minimum value is "+min);

    }
}


