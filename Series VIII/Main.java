#include<iostream>
using namespace std;
int main()
{
  int i,n,a=4,d;
  cin>>n;
  for(i=1;i<=n;i++) {
	cout<<a<<" ";
    d = i * i;
    a += d;
  }
  return 0;
}