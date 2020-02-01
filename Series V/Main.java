#include<iostream>
using namespace std;
int main()
{
  int n,a=11;
  cin>>n;
  for(int i=0;i<n;i++, a += 4)
    cout<<(a * a)<<" ";
  return 0;
}