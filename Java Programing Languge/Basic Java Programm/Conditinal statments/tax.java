import java.util.Scanner;

public class tax{
 public static void main(String[] args) {
    System.out.println("your income Salary:");
    Scanner sc=new Scanner(System.in);
int income=sc.nextInt();
int Tax;
if(income<=500000){
    Tax=0;
}
else if(income>=500000 && income<=100000)
{
    Tax=(int)(0.2*income); 
}
    else{
        Tax=(int)(income*0.3); 
    }
    System.out.println("..................................................");
    System.out.println("The income tax is:" + Tax);
    System.out.println("..................................................");   
    int number=3;
    String type=(number%2 == 0)? "even":"odd";
    System.out.println(type);
    
}
}