#include<iostream>
using namespace std;

int gcd(int a, int b) {
 if(a == 0)
   return b;
 else if(b == 0)
   return a;
  else if(a == b)
    return a;
  else if(a > b)
    gcd(a - b, b);
  else
    gcd(a, b - a);
}
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"Enter two positive integers"<<endl;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b)<<endl;
  return 0;
}