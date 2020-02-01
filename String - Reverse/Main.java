#include<string.h>
#include<iostream>
using namespace std;
int main()
{
  string n;
  cin>>n;
  cout<<"The reversed String is ";
  for(int i = n.length() - 1;i >= 0; i--)
    cout<<n[i];
  cout<<"."<<endl;
  return 0;
}