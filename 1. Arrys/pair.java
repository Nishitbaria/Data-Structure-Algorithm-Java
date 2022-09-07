public class pair {
 public static void pair2(int number[]) {
for(int i =0 ;i< number.length ; i++){
int currnum = number[i];
for(int j = i+1; j< number.length; j++){
System.out.print("("+currnum + number[j]+ ")" );
}
System.out.println(" ");
}

 }
    public static void main(String[] args) {
int number[] ={1,2,3,4}; 
        pair2(number);    //calling pairing funcations<--     
    }
}
