#include<iostream>
using namespace std;
int main()
{
  int d1,d2,d3,d4,d5,d6,d7,total,n1=0,n2=0,diff;
  cin>>d1>>d2>>d3>>d4>>d5>>d6>>d7;
  total=d1*100+d2*100+d3*100+d4*100+d5*100+d6*100+d7*100;
  if(d1>0)
  {
    n1=(d1*(50/100.0)*100);
    total=total+n1;
  }
  if(d7>0)
  {
    n2=(d7*(25/100.0)*100);
      total=total+n2;
  }
  if(d1>8)
    total=((d1-8)*15)+total;
   if(d2>8)
    total=((d2-8)*15)+total;
   if(d3>8)
    total=((d3-8)*15)+total;
   if(d4>8)
    total=((d4-8)*15)+total;
   if(d5>8)
    total=((d5-8)*15)+total;
   if(d6>8)
    total=((d6-8)*15)+total;
   if(d7>8)
    total=((d7-8)*15)+total;
    cout<<total;
  return 0;
}