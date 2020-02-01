#include<iostream>
using namespace std;
int main()
{
  int n,i=0;
  cin>>n;
  while(n != 1) {
    cout<<n<<endl;
    i++;
    if(n % 2 == 1)
      n = (3 * n) + 1;
    else
      n /= 2;
  }
  cout<<n<<endl;
  cout<<i<<endl;
  return 0;
}