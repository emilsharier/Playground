#include<iostream>
using namespace std;
int main()
{
  int n, so = 0, se = 0;
  cin>>n;
  while(n) {
	if((n % 10) % 2 == 0)
      se += (n % 10);
    else
      so += (n % 10);
    n /= 10;
  }
  if(se == so)
    cout<<"Yes"<<endl;
  else
    cout<<"No"<<endl;
  return 0;
}