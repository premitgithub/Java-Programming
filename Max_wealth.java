package Arrays;

import java.util.*;

public class Max_wealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, row, col, item, c = 0, var1 = 0, var2 = 0;
        //ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the row");
        row = sc.nextInt();
        System.out.println("Enter the coloumn");
        col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the array elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int k=Max_amount(arr, row, col);
        System.out.println("Maximum wealth of a person is : "+k);
    }
    public static int Max_amount(int[][] arr,int row, int col)
    {
        int sum=0,max=0;
        for(int i=0;i<row;i++)
        {
            sum=0;
            for(int j=0;j<col;j++)
            {
                sum+=arr[i][j];
            }
            if(sum>max)
                max=sum;
        }
        return max;
    }
}
