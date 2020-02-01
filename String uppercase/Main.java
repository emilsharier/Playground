#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string n;
  cin>>n;
  cout<<"String in uppercase is ";
  for(int i = 0; i < n.length();i++)
    cout<<(char)(n[i] - 32);
  return 0;
}