#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[10],b[10];
  cin>>a>>b;
  if(strcmp(a,b) == 0)
    cout<<"Strings are same"<<endl;
  else
    cout<<"Strings are not same"<<endl;
  return 0;
}