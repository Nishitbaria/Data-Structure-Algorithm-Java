#include<iostream>
using namespace std;


bool checkpalindrom(string str, int i ,int j  ) {
   
   if(i > j) {
    return true;
   }
   
    if(str[i] != str[j] )
        return false;
 else {
     checkpalindrom( str,i+1,j-1);
 }
}

int main(){
string str = "abba" ; 

bool ispalindrom =  checkpalindrom (str,0,str.length()-1);

if(ispalindrom){
    cout<<"Given string is palindrom"<<endl;
}
else {
 cout<<"Given string is not  palindrom"<<endl;
}

cout<<str;

return 0 ;
}
