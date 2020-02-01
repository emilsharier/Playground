#include<cctype>
#include<iostream>
using namespace std;
int main()
{
  string n;
  getline(cin,n);
  int i;
  for(i = 0;i < n.length(); i++)
    if(isalpha(n[i]))
      cout<<n[i];
  return 0;
}