import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.ietf.jgss.Oid;

public class SwapNum {
    

public static void swap(    ArrayList<Integer> lists, int idx1,int idx2   ){
int temp = lists.get(idx1);
lists.set(idx1,lists.get(idx2));
lists.set(idx2,temp);
}


    public static void main(String[] args) {
int idx1 = 0;
int idx2 = 1;
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(4);
        lists.add(2);
        lists.add(3);
        lists.add(1);        
System.out.println( " Before swap -> "  +   lists);
swap(lists, idx1, idx2);
System.out.println( " After swap -> "  + lists);

//sort the Arrys List
Collections.sort(lists);

System.out.println( " After Sort -> "  + lists);
Collections.sort(lists,Collections.reverseOrder());
System.out.print( " After Sort  Reverse -> "  + lists);

}
}
