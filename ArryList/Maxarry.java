import java.util.ArrayList;

public class Maxarry {
    
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(2);
        lists.add(4);
        lists.add(9);
        lists.add(6);
        lists.add(3);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i< lists.size();i++){
// if(max < lists.get(i)){
//     max = lists.get(i);
// }
//or
max = Math.max(max, lists.get(i));
min = Math.min(max,lists.get(i) );


        }
        System.out.println( " Max ->"  +max);
        System.out.print( " min ->"  +min);
    }
}
