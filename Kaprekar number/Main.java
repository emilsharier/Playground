#include<iostream>
#include<stdlib.h>
using namespace std;
int main()
{
  int count=1,i,sum=0,n,sq,t=0,a=0,flag =0;
  cin>>n;
  sq = n * n;
  if(sq / 10 == 0) {
	cout<<"Not a Kaprekar Number"<<endl;
    exit(0);
  }
  t = sq;
  while(t > 9) {
    a = (a * 10) + (t % 10);
    t /= 10;
    count *= 10;
  }
  t = sq;
  int x;
  //cout<<count<<endl;
  while(count) {
	x = t / count;
    sum = x + (t % count);
    //cout<<"x is "<<x<<endl;
    //cout<<"t is "<<(t % count)<<endl;
    //cout<<"Sum is "<<sum<<endl;
    if(sum == n) {
      flag = 1;
      break;
    }
    count /= 10;
  }
  
  if(flag)
    cout<<"Kaprekar Number"<<endl;
  else
    cout<<"Not a Kaprekar Number"<<endl;
  return 0;
}
