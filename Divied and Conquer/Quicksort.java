public class Quicksort {
    
    public static void quicksort(int arr[],int si , int ei){
if(si >= ei)
{
    return;
}
//last element in arry 
       int pIdx =    partision(arr,si,ei);
       quicksort(arr, si, pIdx-1); //left side of pinx
       quicksort(arr, pIdx+1, ei);//Right side of pinx
    }

    public static int  partision(int arr[],int si , int ei){
   int pivot = arr[ei];
   int i = si-1;
   for(int j=si; j <= ei;j++){
if(arr[j] < pivot){
i++; //swap
int temp = arr[j];
arr[j] = arr[i];
arr[i] = temp;
                  }

                            }
i++;
int temp = pivot;
arr[ei] = arr[i];
arr[i] = temp;
return i ; 
}
public static void printArr(int arr[]) {
    for(int i=0; i<arr.length; i++) {
        System.out.print(arr[i] +" ");
    }
    System.out.println();
}



 public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        quicksort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
//made by Nh :) Thank you 
