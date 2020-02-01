#include<iostream>
using namespace std;

int digits(int n) {
if(n < 10)
  return 1;
  else
    return (1 + digits(n / 10));
}

int main()
{
  int n;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The number of digits in "<<n<<" is "<<digits(n)<<endl;
  return 0;
}