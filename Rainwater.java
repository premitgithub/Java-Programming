
package Array;
import java.util.*;
public class Rainwater {
    public static void main(String[] args) {
        int[] height={1,2,3,4};
        int[] left_max = new int[height.length];
        int[] right_max = new int[height.length];
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int count = height.length - 1;

        for(int i=0 ; i<height.length ; i++ ){
            max = Math.max(max, height[i]);
            left_max[i] = max;

            max2 = Math.max(max2, height[count]);
            right_max[count] = max2;
            count--;
        }

        int vol_water= 0;


        for(int i=0 ; i<height.length ; i++){
            
            vol_water += (Math.min(right_max[i], left_max[i]) - height[i]);;
        }
        System.out.println(vol_water);
    }
    
}
