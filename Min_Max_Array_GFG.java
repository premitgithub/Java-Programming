public class Min_Max_Array_GFG
{
    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
    public static Pair<Integer, Integer> getMinMax(int[] arr) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return new Pair<>(min,max);
    }

    public static void main(String[] args) {
        int[] arr={3, 2, 1, 56, 10000, 167};
        System.out.print(getMinMax(arr).getKey()+" ");
        System.out.print(getMinMax(arr).getValue());
    }
}
