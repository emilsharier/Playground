#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[10],b[10];
  cin>>a>>b;
  strcat(a,b);
  cout<<"The concatenated string is "<<a<<endl;
  return 0;
}