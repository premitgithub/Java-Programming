package Arrays;

import java.util.*;

public class Even_digit_2D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, row, col, item, c = 0, var1 = 0, var2 = 0;
        ArrayList<Integer> list = new ArrayList<>();
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
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] % 2 == 0) {
                    list.add(arr[i][j]);
                } else {
                    continue;
                }
            }
        }
        System.out.println("Even digits in an array are: "+list);
    }
}
