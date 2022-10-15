import java.lang.reflect.Array;
import java.util.Arrays;

public class main{

    public static void main(String[] args) {
        int nishit[] = {2,5,7,8,2,8};
        

        for(int i=0 ; i < nishit.length;i++){
            Arrays.sort(nishit);
            System.out.print(nishit[i]+ " ");
        }
    
    }
}

