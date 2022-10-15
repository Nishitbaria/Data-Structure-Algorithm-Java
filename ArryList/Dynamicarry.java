import java.util.ArrayList;

public class Dynamicarry{


public static void main(String[] args) {
    ArrayList<Integer> lists = new ArrayList<>();

//TO add Elements IN Arrys put demo.add();      
lists.add(4);
lists.add(2);
lists.add(3);
lists.add(1);
System.out.println(lists);

//TO get the value of the Specific index value put the demo.get(index number) 
int a = lists.get(1);
System.out.println( "1 index is -> " +a);
//delete the element in arrylist
lists.remove(2);
System.out.println( "After the delete index no 2 -> " +lists+ " <- 3 has been removed");

//set new value for old index value
lists.set(1, 5);
System.out.println( " Before { 4,2,1}" +  " After -> " +lists + " <- 2 has been replace by the 5 ");

//contain elements
System.out.println(lists.contains(5));

System.out.println(lists.contains(10));

//adding data in arry  T.c-> O(N)

System.out.println(  "  before adding elements"+lists);
lists.add(0, 10);
System.out.println(  "  After adding elements"+lists);

}




}