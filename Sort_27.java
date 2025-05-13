package Array_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sort_27
{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(4);
        list.add(15);
        Collections.sort(list);//ascending order
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());//descending order
        System.out.println(list);
    }
}
