#include<iostream>
using namespace std;

int fun(int a, int n) {
if(n == 0)
  return 1;
  else
    return (a * fun(a, n - 1));
}

int main()
{
  int a,n;
  cout<<"Enter the value of a"<<endl;
  cout<<"Enter the value of n"<<endl;
  cin>>a>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<fun(a,n)<<endl;
  return 0;
}