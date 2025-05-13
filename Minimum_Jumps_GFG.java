public class Minimum_Jumps_GFG {
    public static int minJumps(int[] arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return -1;
            }
            if(arr[i]==arr[arr.length-1]){
                return count;
            }
            if((i+arr[i])<arr.length-1){
                arr[i]=arr[i+arr[i]];
                count++;
            }
            else {
                arr[i]--;
                //System.out.println(x);
                //i--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1, 1, 1, 1,1};
        System.out.println(minJumps(arr));
    }
}
