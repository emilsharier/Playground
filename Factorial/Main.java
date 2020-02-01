#include<iostream>
#include<stdlib.h>
using namespace std;

int fact(int n) {
  if(n <= 1)
    return 1;
  else
    return (n * fact(n - 1));
}

int main()
{
  int n;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n)<<endl;
  return 0;
}