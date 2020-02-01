#include<iostream>
using namespace std;
int main()
{
  int t=2,i,n;
  cin>>n;
  int *a;
  for(i=0;i<n;i++)
    cin>>*(a + i);
  cout<<"1"<<endl;
  for(i=0;i<n - 1;i++) {
    if(*(a + i) < *(a + i + 1)) {
     cout<<t<<endl;
      t += 2;
    }
    else
      cout<<"1"<<endl;
  }
  return 0;
}