package Binary_Search;

import  java.util.*;
public class Rotated_sorted_duplicate {
    public static void main(String[] args) {

        int[] arr ={4,4,4,5,4};
        int[] crr = {6,6,6,6,6,6};
        System.out.println(CheckPivot(crr));
    }

    static int CheckPivot(int[] brr){

        int start = 0;
        int end = brr.length-1;
        int count = brr.length;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(brr[start] == brr[mid] && brr[end] == brr[mid]){
                start++;
                end--;
            }if(brr.length == 1){
                ans = brr[mid];
            }
            else{
                while(start <= end){
                    int mid1 = start + (end - start)/2;
                    if(brr[start] == brr[mid] && brr[end] == brr[mid]){
                        ans = brr[mid];
                    }
                    else if(brr[mid1] > brr[mid1 + 1]){
                        ans = brr[mid1];
                    }else if(brr[mid1] < brr[mid1 - 1]){
                        ans = brr[mid1-1] ;
                    }
                    if( brr[start] > brr[mid1]){
                        end = mid1 - 1;
                    }if(brr[start] <= brr[mid1]){
                        start = mid1 + 1;
                    }
                }
            }


        }
        return ans;
    }
}