#include<iostream>
using namespace std;


 void checkpalindrom(string &str, int i ,int j  ) {
   
   if(i > j) {
    return true;
   }
   
    if(str[i] != str[j] )
        return false;
 else {
      return    checkpalindrom(str,i+1,j-1);
 }
}

int main(){
string str = "Nishit" ; 

bool  checkpalindrom (str,0,str.length()-1);

if(checkpalindrom){
    cout<<"Given string is palindrom";
}
else {
 cout<<"Given string is not  palindrom";
}

cout<<str;

return 0 ;
}
