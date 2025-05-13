package Array;
import java.util.*;
public class counting_sort16 {
    public static void main(String[] args) {
        int[] arr={1,4,1,3,2,4,3,7};
        int[] brr = new int[arr.length];
        int[] crr = new int[arr.length];

        for(int i=0 ; i<arr.length ; i++){
            brr[arr[i]]++;
        }
        
        System.out.println(Arrays.toString(brr));
        int i=0,j=0;
        while(i<arr.length) {
            if(brr[j] != 0){
                for(int k=0 ; k<brr[j] ; k++){
                    crr[i] = j;
                    i++;
                }
            }
        j++;
        }
        System.out.println(Arrays.toString(crr));
    }
    
}
