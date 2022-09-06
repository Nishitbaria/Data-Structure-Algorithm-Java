public class Product{
    public static int sum(int a,int b) {
        return a*b;
    }
public static int factorial (int n)
{
int f=1;
for(int i=1;i<=n;i++){
    f=f*i;
}
return f;
}
public static float bionomi(int n, int r){
int fact_n= factorial(n);
int fact_r =factorial(r);
int fact_nmr = factorial(n-r);
float sum=fact_n/(fact_r*fact_nmr);
return sum;
}
public static void main(String[] args) {
    int a=5;
    int b=10;
    System.out.println("A*B is :"+sum(a, b));
System.out.println(bionomi(5,2));
}

}