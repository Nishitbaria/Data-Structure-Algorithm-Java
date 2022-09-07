import javax.sound.sampled.ReverbType;

public class Lineersearch {
   public static int  Lineersearchfun(int Number[],int key){
    for(int i=0;i<Number.length;i++){
if(Number[i] == key){
    return i;
}

    }
    return -1;
   }
    public static void main(String[] args) {
int Number[] = {1,2,4,5,6,7,8,3,6,225,252,6254,23};
int key=0;      
int index =   Lineersearchfun(Number, key);
if(index == -1){
    System.out.print("Index is not found :(");
}
else {

    System.out.print("The Position of Number is "+ index);
}
    }
}
