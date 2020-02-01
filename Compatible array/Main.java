#include<iostream>
using namespace std;
int main()
{
  int i,n,m,f=0;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    cin>>a[i];
  cin>>m;
  int b[m];
  for(i=0;i<m;i++)
    cin>>b[i];
  if(n!=m)
    cout<<"Incompatible"<<endl;
  else {
	for(i=0;i<n;i++)
      if(a[i]<b[i]) {
		f=1;
        break;
      }
      if(f)
    cout<<"Incompatible"<<endl;
  else
    cout<<"Compatible"<<endl;
  }
  return 0;
}