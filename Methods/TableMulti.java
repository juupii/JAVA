import java.util.Scanner;

public class TableMulti {
    public static void multiplication(int a)
    {
     for(int i = 1; i <=10 ; i++)
     {
        System.out.format("%d x %d = %d\n", a , i , a * i);
     }
     //return multiplication(num);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = 0;
      num = sc.nextInt();
      //table(a);
      //int a;
      multiplication(num);
      sc.close();
      
    }
}
