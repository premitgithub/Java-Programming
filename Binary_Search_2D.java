package Binary_Search;

import java.util.*;
public class Binary_Search_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {{10, 20, 30, 40}, {11, 25, 35, 45}, {28, 29, 37, 49}, {33, 34, 38, 50}};
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the element to be searched");
        int element = sc.nextInt();
        System.out.println(Arrays.toString(Binary_search(matrix,element)));

    }

//

    public static int[] Binary_search(int[][] matrix,int element)
    {
        int row=0;
        int col=matrix[0].length-1;
        int[] arr={-1,-1};
        while(row<matrix.length&&col>0)
        {
            if(matrix[row][col]>element)
            {
                col--;
            }
            else if(matrix[row][col]<element)
            {
                row++;
            }
            else if(matrix[row][col]==element)
            {
                arr[0]=row;
                arr[1]=col;
                return arr;
            }
        }
        return arr;
    }
}
