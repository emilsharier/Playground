#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string n;
  cin>>n;
  cout<<"The output string is ";
  for(int i = 0; i < n.length();i++)
    if(n[i] <= 'Z' && n[i] >= 'A')
      cout<<(char)(n[i] + 32);
  else
    cout<<n[i];
  return 0;
}