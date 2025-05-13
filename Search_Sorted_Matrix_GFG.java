package Matrix;

public class Search_Sorted_Matrix_GFG {
    public static boolean searchMatrix(int[][] mat, int x) {
        // code here
        int i=0,j=mat[0].length-1;
        while(i< mat.length && j>=0){
            if(x == mat[i][j]){
                return true;
            }
            if(x > mat[i][j]){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat={{87, 96, 99},{101, 103, 111},{30, 34, 43, 50}};
        System.out.println(searchMatrix(mat,101));
    }
}
