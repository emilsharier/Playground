#include<iostream>
using namespace std;
int main()
{
  int n,a=5,d=11,i,k=1;
  cin>>n;
  for(int i=1;i<=n;i++) {
	cout<<a<<" ";
    a += d;
    k += 2;
    d = (11 * k);
  }
  return 0;
}