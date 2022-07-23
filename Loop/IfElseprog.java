import java.util.Scanner;
public class IfElseprog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks1: ");
        int marks1 = sc.nextInt();
        System.out.println("Enter marks2: ");
        int marks2 = sc.nextInt();
        System.out.println("Enter marks3: ");
        int marks3 = sc.nextInt();
        float percentage = (marks1 + marks2 + marks3)/3.0f;
        System.out.println(percentage);
        if(percentage >= 40 && marks1 >= 33 && marks2 >= 33 && marks3 >= 33){
            System.out.println("PASSED");
        }
        else{
        System.out.println("FAIL");
        }
        sc.close();
    }
    
}
