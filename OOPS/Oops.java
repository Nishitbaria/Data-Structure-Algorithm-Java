public class Oops{

    public static void main(String[] args) {
      A A1 = new A();
      System.out.println(A1.a);  
      A1.print(4,6,7);




    }
}
class A{
int a = 10;
void print(int Phy,int Maths,int Chemistry){
  int TOTAl = (Phy+ Maths+Chemistry)/3;
  System.out.println("Total"+TOTAl);
}
   
    }

