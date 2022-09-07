import java.lang.invoke.LambdaConversionException;

public class Langest3Num {
    public static int getlargest(int Number[] ){
int largest = Integer.MIN_VALUE; //its represt -Infinity
int Minimum = Integer.MAX_VALUE; // +Infinity
for(int i=0;i<Number.length;i++){
if(largest < Number[i]){
    largest = Number[i];
}
if(Minimum > Number[i]){
Minimum = Number[i];
}

}
System.out.println("Minimum Number is: "+ Minimum);
return largest ;
    }
    public static void main(String[] args) {
    int Number[]= {1,3,5,7,8,9,13};
System.out.println("The Largest number is : " +  getlargest(Number));        

    }


}
