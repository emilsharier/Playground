#include<iostream>
using namespace std;
int main()
{
  int n;
  int a=0,b=1,c=0,i;
  cin>>n;
  n--;
  if(n == 0)
    cout<<a<<endl;
  else if(n == 1)
    cout<<b<<endl;
  else {
	for(i=2;i<=n;i++){
      c = a + b;
      a = b;
      b = c;
  }
  }
    cout<<c<<endl;
  	return 0;
}