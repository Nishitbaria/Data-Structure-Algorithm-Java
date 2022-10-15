import java.util.ArrayList;
import java.util.List;

public class size {
    

    public static void main(String[] args) {
        
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(4);
        lists.add(2);
        lists.add(3);
        lists.add(1);
        System.out.println( "size of arrys is -> "+ lists.size());

for(int i=0 ; i < lists.size();i++){
    System.out.print(lists.get(i)+ " ");

}System.out.println();
System.out.print(" reverse arrys-> ");

for(int i=lists.size()-1 ; i>= 0; i--){
    System.out.print( lists.get(i)+ " ");

}


    }
}
