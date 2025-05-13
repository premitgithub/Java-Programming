package Binary_Search;

import java.util.*;

public class twoD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, row, col, item,c=0,var1=0,var2=0;
        System.out.println("Enter the row");
        row = sc.nextInt();
        System.out.println("Enter the coloumn");
        col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the element to be searched");
        item = sc.nextInt();
        System.out.println("Enter the array elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == item) {
                    var1=i+1;
                    var2=j+1;
                    c++;
                    break;
                } else {
                    continue;
                }
            }
        }
        if(c==0)
            System.out.println("Element not found");
        else

            System.out.println("Element found at "+(var1)+"th row and "+(var2)+"th coloumn");

    }
}
