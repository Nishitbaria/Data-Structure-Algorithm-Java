import java.util.Scanner;

public class input{
public static void main(String[] args) {
int marks[] = new int[100];
Scanner sc = new Scanner (System.in);
marks[0] = sc.nextInt();
marks[1] = sc.nextInt();
marks[2] = sc.nextInt();
System.out.println("Phyicas marks :" + marks[0]);
System.out.println("CHEMISTRY marks :" + marks[1]);
System.out.println("Maths marks :" + marks[2]);
int percentage=((marks[0]+marks[1]+marks[2])/3);
System.out.println("Percentage of Student is " + percentage + "%");
System.out.println("The Length of an ARRYS IS "+marks.length);
}
}