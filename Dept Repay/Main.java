#include<iostream>
using namespace std;
int main()
{
  int p,t,r,si,total;
  float d,to;
  cin>>p>>r>>t;
  si = (p * t * r) / 100;
  total = si + p;
  d = si * 0.02;
  cout<<si<<endl;
  cout<<total<<endl;
  cout<<d<<endl;
  to = total - d;
  cout<<to<<endl;
  return 0;
}