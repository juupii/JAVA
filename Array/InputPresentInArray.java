import java.util.Scanner;
public class InputPresentInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int flag =0;
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in array: ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int n = sc.nextInt();
       // boolean IsArray = false;
        for(int i = 0; i < size; i++){
        if(arr[i] == n)
        {
           // IsArray = true;
            System.out.println("ELEMENT " +n+  " FOUND AT " +i+ " POSITION");
            flag = 1;
            break;
        }
    }
        if(flag == 0)
        {
            System.out.println("NOT FOUND");
            
        }
        
        sc.close();
}
}
