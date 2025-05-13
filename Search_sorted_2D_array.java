package Binary_Search;

import java.util.*;
public class Search_sorted_2D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12,13}};
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the element to be searched");
        int element = sc.nextInt();
        //System.out.println(Arrays.toString(Binary_search(arr,element)));

    }

    public static int Binary_search(int[][] arr,int element)
    {
        int row_start=0;
        int row_end= arr.length-1;

        int col_start=0;
        int col_end=arr[0].length-1;

        int[] arr2={-1,-1};
        while(row_start<arr.length)
        {
            int row_mid=row_start+(row_end-row_start)/2;
            int col_mid=col_start+(col_end-col_start)/2;
            int mid=arr[row_mid][col_mid];
            if(mid==element)
            {
                arr2[0]=row_start;
                arr2[1]=col_start;
            }
            else if(arr[row_mid][col_mid]>element)
            {
                col_start--;
            }
            else if(arr[row_mid][col_mid]<element)
            {
                row_start++;
            }
        }
        return 0;
    }
//    public static int Binary_search(int[][] arr,int element)
//    {
//        int row_s=0;
//        int row_e=arr.length-1;
//        int col_s=0;
//        int col_e=arr[0].length-1;
//        int mid_row=row_s+(row_e-row_s)/2;
//        int mid_col=col_s+(col_e-col_s)/2;
//
//        int[] arr2=new int[2];
//        for(int i=0;i<arr.length;i++)
//        {
//            int mid=arr[mid_row][mid_col];
//            for(int j=0;j<arr[i].length;i++)
//            {
//                if(element==arr[i][j])
//                {
//                    arr[0]=i;
//                    arr[1]=j;
//                    break;
//                }
//                else if(element>arr[i][j])
//                {
//
//                }
//            }
//        }
//    }
}