public class reverseArrys {
    public static void swap( int number[]){
int first=0,last=number.length-1;
while(first < last){
int temp=number[last];
number[last]=number[first];
number[first]=temp;
first++;
last--;
} 

        
}



    public static void main(String[] args) {
      int  number[]={12,23,32,43,52};
      swap(number);
for(int i=0 ; i< number.length;i++) {
System.out.print(number[i] + " ");
}

System.out.println("");
}



}
