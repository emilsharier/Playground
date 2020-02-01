#include<iostream>
using namespace std;
int main()
{
  int d=2,a=9,b,i,n;
  cin>>n;
  for(int i=0;i<n;i++) {
	cout<<a<<" ";
    b = a;
    a += d;
    d = b;
  }
}