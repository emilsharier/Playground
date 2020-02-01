#include<iostream>
using namespace std;
int main()
{
  float r,h,x,hours,pi=3.14;
  cin>>r>>h>>x>>hours;
  float cap = pi*r*r*h;
  float cap2 = x * hours;
  
  if(cap > cap2)
    cout<<"The tank cannot be filled within "<<hours<<" hours"<<endl;
  else
    cout<<"The tank can be filled within "<<hours<<" hours"<<endl;
  return 0;
}