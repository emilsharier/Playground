#include<iostream>
using namespace std;

int prime(int n,int i) {
  if(n % i == 0 )
    return 1;
  else if(i > (n / 2))
    return 0;
  else
    return prime(n, i + 1);
}

int main()
{
  int n;
  cin>>n;
  if(prime(n,2) == 0)
    cout<<"Prime Number"<<endl;
  else
    cout<<"Not a Prime Number"<<endl;
  return 0;
}