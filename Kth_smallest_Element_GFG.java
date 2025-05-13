package Arrays;

class Kth_smallest_Element_GFG{
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        quickSort(arr,0,arr.length-1);
        return arr[k-1];
    }
    public static void quickSort(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int pIdx=partition(arr,si,ei);
        quickSort(arr,si,pIdx-1);
        quickSort(arr,pIdx+1,ei);
    }
    public static int partition(int[] arr,int si,int ei){
        int i=si-1,temp;
        int pivot=arr[ei];

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr={3,4,7,9,1,0};
        System.out.println(kthSmallest(arr,3));
    }
}
