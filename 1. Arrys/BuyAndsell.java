public class BuyAndsell {
 public static int Buyandsellstocks(int price[]){
    int Buyprice = Integer.MAX_VALUE; // -infinity
int Maxprofit = 0; 
for(int i = 0 ; i< price.length; i++){
if( Buyprice < price[i]){ //profit
int profit = price[i] - Buyprice ; //todays profit :) 
Maxprofit = Math.max(Maxprofit, profit);  

}
else {
Buyprice = price[i];
}

}

return Maxprofit ;

 }



    public static void main(String[] args) {
        int price[] = {7,1,5 ,3,5,6} ;
        System.out.println( " Your Profit is "  +Buyandsellstocks(price) + " Rs");  //Time complexcity is O(n) Ans is 5
    }
}
