#include<iostream>
using namespace std;
int main()
{
  int i,n,a=2;
  cin>>n;
  for(i=1;i<=n;i++) {
   	 cout<<a<<" ";
    a = (a * a) - 1;
  }
  return 0;
}