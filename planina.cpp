#include <iostream>
using namespace std;

int main() { 
  int n;
  cin>>n;
  if(1<=n && n<=15){
    int x=2;
    for(int i=1;i<=n;i++) x+=x-1;
    cout<<x*x;
  }
  
}

