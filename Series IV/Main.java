#include<math.h>
#include<iostream>
using namespace std;
int main()
{
  int n;
  float sum = 0.5;
  cin>>n;
  for(int i=0;i<n;i++) {
    cout<<sum<<" ";
    sum += (pow(3,i));
  }
  return 0;
}