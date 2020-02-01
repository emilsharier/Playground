#include<iostream>
using namespace std;
int main()
{
  int i,c=0,s=0,n,t;
  cin>>n;
  while(n > 0) {
	cin>>t;
    n -= t;
    c++;
  }
  cout<<"The number of turns is "<<c<<endl;
  return 0;
}