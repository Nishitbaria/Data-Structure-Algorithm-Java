import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class ifelse{
 public static void main(String[] args) {
  int age=19;
  if(age>=18)
  {
System.out.println("You are Adulte:) ");
  }
  else
  {
    System.out.println("You are not Adult :)  ");
  }

  System.out.println("...............................................................");
  System.out.println("Print the largest of Two");

  int A=12; 
  int B=23;
  if(A>=B) {
System.out.println("A is Larger");
  }
  else {
    System.out.println("B is Larger");
  }
  System.out.println(".............................................................................................................");
  System.out.println("Given number is Odd or Even");
  Scanner sc=new Scanner(System.in);
  int number=sc.nextInt();
  if(number % 2 == 0 ) {
    System.out.println("even");
  }
  else{
    System.out.println("Odd");
  }
}

}