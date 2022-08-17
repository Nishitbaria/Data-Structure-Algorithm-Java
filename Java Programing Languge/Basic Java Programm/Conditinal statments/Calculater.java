import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a:");
    int a=sc.nextInt();
    System.out.println("Enter b");
    int b=sc.nextInt();
    System.out.println("Enter Operator:");
    char Operator=sc.next().charAt(0);
    System.out.println("Enter Operator:");
        switch(Operator){
        case '+': System.out.println("a+b is :" + a+b);
        break;
        case '-': System.out.println(a-b);
        break;
        case '*': System.out.println("a*b is :" + a*b);
        break;
        case '/': System.out.println(a/b);
        break;
        case '%': System.out.println(a%b);
        break;
      default : System.out.println("Wrong operator:");
       break;
    }
}
}