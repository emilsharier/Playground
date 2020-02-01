#include<iostream>
using namespace std;
int main()
{
  int m,n,i;
  cin>>m>>n;

  int a[m],b[n];
    for(i=0;i<m;i++)
      cin>>a[i];
  	for(i=0;i<n;i++)
      cin>>b[i];
  if(n==m) {
    int f = 1;
	for(i=0;i<n;i++)
      if(a[i] != b[i]) {
       	f = 0;
        break;
      }
    if(f)
      cout<<"Same"<<endl;
    else
      cout<<"Not Same"<<endl;
  }
  else
    cout<<"Not Same"<<endl;
  return 0;
}