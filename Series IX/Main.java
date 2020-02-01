#include<iostream>
using namespace std;
int main()
{
  int i,d,a=2,n;
  cin>>n;
  for(i=1;i<=n;i++) {
	cout<<a<<" ";
    d = 13 * i;
    a += d;
  }
  return 0;
}