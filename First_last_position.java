package Binary_Search;

import java.util.*;
public class First_last_position
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, element;
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements in sorted form");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        element = sc.nextInt();
        System.out.println("Occurence of the element is "+Arrays.toString(search(arr,size,element)));
    }
    public static int[] search(int[] arr,int size,int element) {
        int start = 0, mid;
        int end = arr.length - 1, occ_first=0, occ_last=0;
        int[] arr2 = new int[2];
        for (int i = 0; i < size; i++) {
            mid = (start - end) / 2 + end;
            if (arr[mid] == element) {
                occ_first = mid;
                occ_last = mid;
                for(int j=mid;j>=0;j--)
                {
                    if (arr[j] == element) {
                        occ_first = j;
                        arr2[0]=occ_first;
                    }
                }
                for(int p=mid;p<arr.length;p++)
                {
                    if (arr[p] == element) {
                        occ_last = p;
                        arr2[1]=occ_last;
                    }
                }

                    if (occ_first == occ_last) {
                        arr2[0] = occ_first;
                        arr2[1] = occ_first;
                    }
            }
            else if (arr[mid] > element) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return arr2;
    }
}
