#include<iostream>
using namespace std;

int con(int n, int m) {
	if(n <= 1)
      return n;
  	else 
      return ( (n % m) + (10 * con(n/m,m)));
}

int main()
{
  int n,m;
  cin>>n>>m;
  cout<<"Enter the value of n"<<endl;
  cout<<"Enter the base to which you want to convert"<<endl;
  cout<<"The number in base "<<m<<" is "<<con(n,m)<<endl;
  return 0;
}