package Arrays;

import java.util.Arrays;

public class Median_2_sorted_arrays_size_diff_GFG {
    public static double medianOf2(int a[], int b[]) {
        // Your Code Here
        int copy = a.length;
        double median;
        a = Arrays.copyOf(a, a.length + b.length);

        for (int i = 0; i < b.length; i++) {
            a[copy + i] = b[i];
        }
        //merge(a,0,a.length-1);
        Arrays.sort(a);
        int middle=a.length/2;
        if(a.length%2 == 0){
            median = (a[middle-1]+a[middle])/2.0;
        }
        else {
            median=a[middle];
        }
        return median;

    }
//    public static void merge(int[] a,int si,int ei){
//        if(si>=ei){
//            return;
//        }
//        int mid=si+(ei-si)/2;
//        merge(a,si,mid);
//        merge(a,mid+1,ei);
//        mergeSort(a,si,ei,mid);
//    }
//    public static void mergeSort(int[] a,int si,int ei,int mid){
//        int i=si,j=mid+1,k=0;
//        int[] temp=new int[ei-si+1];
//        while(i<=mid && j<=ei){
//            if(a[i]<a[j]){
//                temp[k]=a[i];
//                i++;
//            }
//            else{
//                temp[k]=a[j];
//                j++;
//            }
//            k++;
//        }
//        while(i<=mid){
//            temp[k++]=a[i++];
//        }
//        while(j<=ei){
//            temp[k++]=a[j++];
//        }
//        for(k=0,i=si;k<temp.length;k++,i++){
//            a[i]=temp[k];
//        }
//    }

    public static void main(String[] args) {
        int[] a={-5, 3, 6, 12, 15};
        int[] b={-12, -10, -6, -3, 4, 10};
        System.out.println(medianOf2(a,b));
    }
}
