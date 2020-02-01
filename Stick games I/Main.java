#include<iostream>
using namespace std;
int main()
{
  int n,m,f=0;
  cin>>n>>m;
  while(n && m) {
	n--;
    m--;
    (f == 0) ? f = 1 : f = 0;
  }
  if(f != 0)
    cout<<"Arun Gupta"<<endl;
  else
    cout<<"Mani Iyer"<<endl;
  return 0;
}