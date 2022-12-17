#include<iostream>
using namespace std;


 void Revstr(string &str, int Start ,int end  ) {
    if(Start  > end )
     return ;
     swap(str[Start] , str[end] );
     Start++;   end--;
Revstr( str,Start,end);
}

int main(){
string str = "Nishit" ; 

Revstr( str, 0 , str.length()-1  );

cout<<str;

return 0 ;
}
