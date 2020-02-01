#include<iostream>
using namespace std;
int main()
{
  int i,val=1,hop=0,d=1,n;
  cin>>n;
  for(i=1;i<=n;i++) {
	cout<<val<<" ";
    if(hop == 2) {
		hop = 0;
      d *= 3;
    }
    val += d;
    hop ++;
  }
}