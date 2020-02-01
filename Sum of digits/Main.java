#include<iostream>
using namespace std;

int fun(int n) {
 if(n < 10)
   return n;
  else
    return ((n % 10) + fun(n / 10));
}
int main()
{
	int n;
  cin>>n;
  cout<<"Enter the value of n"<<endl;
  cout<<"The sum of digits in "<<n<<" is "<<fun(n)<<endl;
  return 0;
}