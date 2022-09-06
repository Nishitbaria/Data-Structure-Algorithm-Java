public class Overload {
    public static int sum(int a,int b){
        return a+b;
    }
    /*Adding two number With Float Number Reammber that in JAva when you Enter
     Float number Behind the Float number you need to add F ex:12.46f*/
    public static float sum(Float a,Float b,Float c){
        return a+b+c;
    }
    
    public static void main(String[] args) {
    
     System.out.println("sum of A+B:"   + sum(4, 5));
     System.out.println("sum of A+B+C:" +sum(4.5f, 5.5f,6.4f));
    }
}
