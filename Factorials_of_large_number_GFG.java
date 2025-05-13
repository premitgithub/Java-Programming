import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Factorials_of_large_number_GFG {

    public static ArrayList<Integer> factorial(int n){
        ArrayList<Integer> list=new ArrayList<>();
        BigInteger num=BigInteger.valueOf(n);
        BigInteger f = BigInteger.ONE; // Initialize factorial as 1

        for (BigInteger i = BigInteger.TWO; i.compareTo((num)) <= 0; i= i.add(BigInteger.ONE)) {
            f = f.multiply(i);
        }

        while(f.compareTo(BigInteger.ZERO) !=0 ){
            BigInteger d=f.mod(BigInteger.TEN);
            list.add(d.intValue());
            f=f.divide(BigInteger.TEN);
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        System.out.println(factorial(88));
    }
}
