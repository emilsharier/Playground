#include<iostream>
using namespace std;
int main()
{
  string a,b;
  cin>>a>>b;
  int i,j,l1,l2,f = 0;
  l1 = a.length();
  l2 = a.length();
  
  //cout<<"l1 "<<l1<<endl;
  //cout<<"l2 "<<l2<<endl;
  
  if(l1 != l2)
    f = 1;
  
  else {
   	for(i=0,j = (l1 - 1); i < l1; i++, j--)
      if(a[i] != b[j]) {
		f = 1;
        break;
      }
  }
  if(f)
    cout<<"It is wrong"<<endl;
  else
    cout<<"It is correct"<<endl;
  return 0;
}