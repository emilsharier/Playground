#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[10],b[10];
  cin>>a>>b;
  if(strcmp(a,b) == 0)
    cout<<"It is correct"<<endl;
  else
    cout<<"It is wrong"<<endl;
  return 0;
}