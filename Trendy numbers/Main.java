#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  if((n / 100) == 0)
    cout<<"Not a Trendy Number"<<endl;
  else {
    n = (n / 10) % 10;
    if(n % 3 ==0)
      cout<<"Trendy Number"<<endl;
    else
      cout<<"Not a Trendy Number"<<endl;
  }
  return 0;
}