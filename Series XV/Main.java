#include<iostream>
using namespace std;
int main()
{
  int n,i,x=5,y=5,z=5,a=3;
  cin>>n;
  for(i=1;i<=n;i++) {
	cout<<a<<" ";
    a += y;
    y = z;
    z = y + x + 1;
    x = y;
    
    
  }
}