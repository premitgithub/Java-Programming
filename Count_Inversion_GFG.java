package Arrays;

public class Count_Inversion_GFG {
    public static int getCount(int[] arr,int start,int end){

        if(start>=end) {
            return 0;
        }
        int mid = start + (end-start)/2;
        int leftCount = getCount(arr, start, mid);
        int rightCount = getCount(arr, mid + 1, end);
        int invCount = merge(arr, start, mid, end);
        return leftCount+rightCount+invCount;

    }
    public static int merge(int[] arr,int start,int mid,int end){
        int[] temp=new int[end-start+1];
        int i=start, j=mid+1;
        int invCount=0,k=0;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else {
                temp[k]=arr[j];
                j++;
                invCount+=(mid-i+1);
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }
        for(k=0,i=start;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
        return invCount;
    }
    public static int inversionCount(int[] arr){
        int count = getCount(arr,0,arr.length-1);
        return count;
    }
    public static void main(String[] args) {
        int[] arr={2, 2,2};
        System.out.println(inversionCount(arr));
    }
}
