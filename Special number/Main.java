#include<iostream>
using namespace std;
int main()
{
  int i,n,m,s,p,n1,n2;
  cin>>m>>n;
  for(i=m;i <= n;i++) {
    n1 = i % 10;
    n2 = i / 10;
    s = n1 + n2;
    p = n1 * n2;
    if(s + p == i)
      cout<<i<<endl;
  }
  return 0;
}