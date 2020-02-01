#include<iostream>
using namespace std;
int main()
{
  int n,a=6,b=5;
  cin>>n;
    for(int i = 1; i <= n; i++){
     cout<<a<<" ";
      a += b;
      b += 5;
    }
  return 0;
}