import java.util.Scanner;
// Finding Area Of Circle
public class AOC{
 public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter your Rad:");
       float rad=sc.nextFloat();
       float area=3.14f*rad*rad;
       System.out.println(area);
    }
}