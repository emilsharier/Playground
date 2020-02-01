#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  float a=95,d=20.5;
  for(int i=0;i<n;i++) {
	cout<<a<<" ";
    a += d;
    d += 2.0;
  }
  return 0;
}