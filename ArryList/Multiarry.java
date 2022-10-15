import java.util.ArrayList;
import java.util.Arrays;
public class Multiarry {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();
    for(int i=0; i<5;i++){
        List1.add(i);
        List2.add(i);
        List3.add(i);
        
    }
        mainlist.add(List1);
        mainlist.add(List2);
        mainlist.add(List3);
        System.out.print(mainlist);
    }
    
}
