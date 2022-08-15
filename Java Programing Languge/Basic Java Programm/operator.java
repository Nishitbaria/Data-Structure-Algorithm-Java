public class operator {
    public static void main(String[] args)
    {
        int a=10;
        int b=5;
        int c=a++; 
        System.out.println(a);//Unaray operators
        System.out.println(c);//Unaray operators
        System.out.print(a+b); //Binaray Operators
        System.out.println(a==b); //Relational Operators
        System.out.println(a!=b);//Relational Operators
        System.out.println(a>=b);//Relational Operators
        System.out.println(a<=b);//Relational Operators
        int x=6;
        x+=4;  //Asignent Operators
        System.out.println(x);
        x-=4; //Asignent Operators
        System.out.println(x);
        x*=6; //Asignent Operators
        System.out.println(x);
        x/=2;//Asignent Operators
        System.out.println(x); 
        System.out.println(3>5 && 10<=5); //logical Operator
        System.out.println(3>5 || 10<=5);  //logical Operator
        System.out.println(!(3>6)); //logical Operator
    }
}
