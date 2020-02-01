#include<iostream>
using namespace std;
int main()
{
  int n,a=2,d=3,i,k=2;
  cin>>n;
  for(int i=1;i<=n;i++, k += 2) {
    cout<<a<<" ";
    a += d;
    d *= 2;
    //cout<<"Difference is "<<d<<endl;
  }
  return 0;
}