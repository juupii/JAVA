import java.util.Scanner;
public class AddTwoMatrices  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the rows of 1st matrix: ");
        int row = sc.nextInt();
        System.out.println("Enter the size of the columns of 1st matrix: ");
        int col = sc.nextInt();
        System.out.println("Enter the size of the rows of 2nd matrix: ");
        int rows1 = sc.nextInt();
        System.out.println("Enter the size of the columns of 2nd matrix: ");
        int col1 = sc.nextInt();
        if(row != rows1 && col != col1 )
        {
            System.out.println("INVALID INPUT");
        }
        else{
        int [][] arr = new int[row][col];
        int [][] arr1 = new int[rows1][col1];
        int [][] result = new int[rows1][col1];
        System.out.println("Enter the elements of the array:  ");
        for(int i =0; i < row; i++ )
        {
            for(int j = 0; j < col; j++)
            {
                arr[i][j] = sc.nextInt();
               // arr1[i][j] = sc.nextInt();
                //result = arr[i][j] + arr1[i][j];
            }
              
        } 
        for(int i = 0;i < rows1; i++ )
        {
            for(int j = 0; j < col1; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col1; j++ )
            {
                for(int k = 0; k < col; k++)
                {
                result[i][j] = arr[i][j] + arr1[i][j];
                }
            }
                
            
        }
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col1; j++ )
            {
                System.out.print(result[i][j]+"\t");
                
            }
            System.out.println();
            
        }
          
      //  result = arr[i][j] + arr1[i][j];
       sc.close();        
    }
}
}
