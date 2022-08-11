import java.util.*;
public class Discount {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t =sc.nextInt();
      while(t-->0)  
      {
        int x = sc.nextInt();
        int ans = (100-x)%100;
        System.out.println(ans);
      }
     
     sc.close(); //System.out.println(ans;
    }
    
}
