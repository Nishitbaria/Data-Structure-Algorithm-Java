import javax.sound.midi.MidiChannel;

public class Binarysearch {
    public static int binsea(int number[],int key){

int start=0,end=number.length-1;

while (start <= end){

int mid = (start + end)/2; 

if(number[mid] == key ){
return mid;
}
if (number[mid] < key ){
start = mid +1;
}
else {
    end = mid -1;
}
}
        return -1;
    }




    public static void main(String[] args) {
int number[] = {1,4,6,8,10,35};
 int key =10;
System.out.println( "index for The Key is :"  +binsea(number, key));
    }
}
