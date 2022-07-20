import java.util.Scanner;

public class CgpaOfThreeSubjects {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks1: ");
    int marks1 = sc.nextInt();
    System.out.println("Enter marks2: ");
    int marks2 = sc.nextInt();
    System.out.println("Enter marks3: ");
    int marks3 = sc.nextInt();
    int TotalMarks = marks1 + marks2 + marks3;
    System.out.println("TotalMarks = "+TotalMarks);
    int percentage = (TotalMarks * 100)/300;
    double Cgpa = (percentage) % 9.5;
    System.out.println("percentage = "+ percentage);
    System.out.println("Cgpa = "+Cgpa);
    sc.close();


        
    }
    
}
