
import java.util.Scanner;


public class Percentage {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the max marks: ");
    int max = sc.nextInt();
    System.out.println("Enter the marks1: ");
    int marks1 = sc.nextInt();
    System.out.println("Enter marks2: ");
    int marks2 = sc.nextInt();
    System.out.println("Enter marks3: ");
    int marks3 = sc.nextInt();
    System.out.println("Enter marks4: ");
    int marks4 = sc.nextInt();
    System.out.println("Enter marks5: ");
    int marks5 = sc.nextInt();
    double percetange = ((marks1 + marks2 + marks3 + marks4 + marks5) * 100)/max;
    System.out.println("perctange = "+percetange);
    sc.close();
        
    }
}
